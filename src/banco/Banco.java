package banco;
public class Banco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("Jubileu");
        p1.openAccount("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.openAccount("CP");
        
        p1.deposit(300);
        p2.deposit(500);   
        p2.withdraw(100);
        
        p1.withdraw(350);
        p1.closeAccount();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
