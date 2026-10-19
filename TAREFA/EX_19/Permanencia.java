package EX_19;

import java.time.Duration;
import java.time.LocalDateTime;

public class Permanencia {
    private static final double VALOR_HORA_CARRO = 10.0;
    private static final double VALOR_HORA_MOTO  = 5.0;

    private Veiculo veiculo;
    private Vaga vaga;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private double valorCobrado;

    public Permanencia(Veiculo veiculo, Vaga vaga, LocalDateTime entrada) {
        if (!vaga.aceita(veiculo)) {
            throw new IllegalArgumentException(
                "Vaga " + vaga.getCodigo() + " não aceita " +
                veiculo.getClass().getSimpleName());
        }
        this.veiculo = veiculo;
        this.vaga = vaga;
        this.entrada = entrada;
        vaga.ocupar(this);
    }

    public boolean isAtiva() { return saida == null; }

   
    public void encerrar(LocalDateTime saida) {
        if (!isAtiva()) {
            throw new IllegalStateException("Permanência já encerrada.");
        }
        if (saida.isBefore(entrada)) {
            throw new IllegalArgumentException("Saída antes da entrada.");
        }
        this.saida = saida;
        this.valorCobrado = calcularValor();
        vaga.liberar();
    }

    
    public double calcularValor() {
        if (entrada == null || saida == null) return 0.0;
        long minutos = Duration.between(entrada, saida).toMinutes();
        long horas = (minutos + 59) / 60; // arredonda para cima
        double tarifa = (veiculo instanceof Carro)
                ? VALOR_HORA_CARRO : VALOR_HORA_MOTO;
        return horas * tarifa;
    }

    public Veiculo getVeiculo() { return veiculo; }
    public Vaga getVaga() { return vaga; }
    public LocalDateTime getEntrada() { return entrada; }
    public LocalDateTime getSaida() { return saida; }
    public double getValorCobrado() { return valorCobrado; }

    @Override
    public String toString() {
        return String.format("Permanencia[veículo=%s, vaga=%s, entrada=%s, saída=%s, valor=R$ %.2f]",
                veiculo.getPlaca(), vaga.getCodigo(), entrada, saida, valorCobrado);
    }
}
