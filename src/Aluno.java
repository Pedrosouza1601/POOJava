public class Aluno {
    public String nome;
    public double nota;


    public void verificarStatus(){
        if(nota >= 7){
            System.out.println("Aprovado");
        }

        else{
            System.out.println("Reprovado");
        }

    }
    public void verificarNota(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota do aluno: " + nota);
    }
}
