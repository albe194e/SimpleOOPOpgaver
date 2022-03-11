public class LampeOpgaveTest {

    void go(){
        LampeOpgave værelse = new LampeOpgave(true);
        LampeOpgave stue = new LampeOpgave(false);
        LampeOpgave køkken = new LampeOpgave();

        værelse.trykPåKontakt();
        stue.trykPåKontakt();
        køkken.trykPåKontakt();

        System.out.println(værelse);
        System.out.println(stue);
        System.out.println(køkken);
    }

    public static void main(String[] args) {
        new LampeOpgaveTest().go();
    }
}
