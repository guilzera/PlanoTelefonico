public class Main {
    public static void main(String[] args) {
        Transferencia t1 = new Transferencia("WhatsApp", 10);
        Transferencia t2 = new Transferencia("YouTube", 150);
        Transferencia t3 = new Transferencia("Instagram", 25);

        PlanoStreamer ps = new PlanoStreamer();
        ps.transferencias.add(t1);
        ps.transferencias.add(t2);
        ps.transferencias.add(t3);

        System.out.println("PLANO STREAMER");
        System.out.println("Transferencias gratuitas: " + ps.calculaTransferenciasGratuitas());

        PlanoInfluencer pi = new PlanoInfluencer();
        pi.transferencias.add(t1);
        pi.transferencias.add(t2);
        pi.transferencias.add(t3);

        System.out.println("PLANO INFLUENCER");
        System.out.println("Transferencias gratuitas: " + pi.calculaTransferenciasGratuitas());
    }
}