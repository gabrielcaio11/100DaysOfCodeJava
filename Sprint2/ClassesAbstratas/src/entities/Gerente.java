package entities;

public class Gerente extends Funcionario {
    private double bonusAnual;

    public Gerente(String nome, String cpf, double salario, double bonusAnual) {
        super(nome, cpf, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15 + bonusAnual; // 15% do salário + bônus anual
    }
}
