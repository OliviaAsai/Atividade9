import java.util.Date;

public class ContaComum extends Movimento{

    protected long numero_conta;
    protected Date data_abertura;
    protected Date data_encerramento;
    private int situacao = 1;
    protected int senha;
    protected double saldo = 0;

}