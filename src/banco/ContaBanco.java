package banco;
//23 min aula teorica 5
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        
    }

    public void openAccount(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta do tipo " + this.getTipo() + " de " + this.getDono() + " aberta com sucesso!");
    }
    
    public void closeAccount(){
        if (this.getSaldo() > 0){
            System.out.println("Conta tem dinheiro e não pode ser fechada!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débitos e não pode ser fechada!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
        
    }
    
    public void deposit(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito de R$" + v + " realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }
    
    public void withdraw(float v){
        if (this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque no valor de " + v + " realizado com sucesso da conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        } else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }
    
    public void payMonthly(){
        float v = 0;
        if("CC".equals(this.tipo)){
            v  = 12f;
        } else if ("CP".equals(this.tipo)) {
            v = 20f;
        }
        if (this.isStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade de R$" + v + " Paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade");
            }
        } else {
            System.out.println("Impossivel pagar a mensalidade de uma conta fechada");
        }
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}


/*
tipo da conta ou CC ou CP
abrir conta muda status pra true e define o tipo
conta corrente ja ganha 50 pila / se for poupança ja ganha 150
pra fechar a conta nao pode ter saldo e nem debito
pra depositar e sacar a conta tem que estar aberta
sacar tem que ter saldo
pagar mensalidade cobrada diretamente do saldo
cc paga 12 e cp paga 20 de mensalidade


Algoritimo

Classe ContaBanco
//Atributos
publico numConta: Inteiro
protegido tipo: Caractere
privado dono: Caractere
privado saldo: Real
privado status: Logico
//metodos
publico Metedo abrirConta()

FimMetodo
publico Metodo fecharConta()

FimMetodo
publico metodo depositar()

FimMetodo
publico metodo sacar()

FimMetodo
//Metodos especiais

FimClasse
*/