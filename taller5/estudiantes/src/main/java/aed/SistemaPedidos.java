package aed;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SistemaPedidos {
    ArrayList<Handle<Pedido>> pedidosPorId;
    ListaEnlazada<Pedido> pedidosPorLlegada;


    public SistemaPedidos(){
        pedidosPorId = new ArrayList<Handle<Pedido>>();
        pedidosPorLlegada = new ListaEnlazada<Pedido>();
    }

    public void agregarPedido(Pedido pedido){
        Handle<Pedido> handle = pedidosPorLlegada.agregarAtras(pedido);
        agregarOrdenado(handle); 
    }

    private void agregarOrdenado(Handle<Pedido> p){
        int i = 0;
        while (i < pedidosPorId.size() && pedidosPorId.get(i).compareTo(p) < 0) {
            i ++;
        pedidosPorId.add(i,p);
        }
    }

    public Pedido proximoPedidoPorId(){
        if (pedidosPorId.isEmpty()) {
            throw new NoSuchElementException("no hay pedidos en el sistema");
        }
        Handle<Pedido> handle = pedidosPorId.get(0);
        pedidosPorId.remove(0);
        handle.eliminar();
        return handle.valor();
    }

    public Pedido proximoPedidoPorLlegada(){
        if (pedidosPorLlegada.longitud() == 0) {
            throw new NoSuchElementException("no hay pedidos en el sistema");
        } else {
            Pedido p = pedidosPorLlegada.obtenerPrimero();
            pedidosPorLlegada.eliminar(0);
            eliminarDePedidosPorId(p);
            return p;
        }
    }
        
    private void eliminarDePedidosPorId(Pedido p){
        int i = 0;
        while (i < pedidosPorId.size() && pedidosPorId.get(i).valor().compareTo(p) != 0) {
            i++;
        } 
        pedidosPorId.remove(i);
    }

    public Pedido pedidoMenorId(){
        if (pedidosPorId.isEmpty()) {
            throw new NoSuchElementException("no hay pedidos en el sistema");
        }
        return pedidosPorId.get(0).valor();
    }

    public String obtenerPedidosEnOrdenDeLlegada(){
        
    }

    public String obtenerPedidosOrdenadosPorId(){
        throw new UnsupportedOperationException("No implementado aún");
    }
}
