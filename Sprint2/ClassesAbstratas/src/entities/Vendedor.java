package entities;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10 + comissao; // 10% do salário + comissão
    }
}
