public class Student {
    public int eta;
    public String nome;

    public Student(String nome, int eta) {
        this.eta = eta;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Student{" +
                "nome=" + nome +
                ", eta='" + eta + '\'' +
                '}';
    }
}
