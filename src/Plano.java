import java.util.ArrayList;

public class Plano {
    public ArrayList<Transferencia> transferencias = new ArrayList<Transferencia>();

    public double calculaTransferenciasGratuitas(String appGratuito) {
        double totalTransferencias = 0;

        for (Transferencia t : transferencias) {
            if(t.app.equals(appGratuito))
                totalTransferencias += t.tamanho;
        }

        return totalTransferencias;
    }
}
