import java.util.Scanner;

public class MonitoramentoLaje{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double cargaProjeto = 15.0;
        double limiteSegurança = cargaProjeto * 0.8;

        System.out.println(" --- Sistema SafeBuild: Monitoramento de Carga ---");
        System.out.println("Digite a leitura atual do sensor (KN/m²): ");

        double cargaAtual = sc.nextDouble();

        if(cargaAtual < limiteSegurança){
            System.out.println("Staus: VERDE");
            System.out.println("Decisão: Operação normal. Carga dentro dos parâmetros de segurança.");
        }else if (cargaAtual >= limiteSegurança && cargaAtual <= cargaProjeto) {
            System.out.println("Status: AMARELO (ALERTA)");
            System.out.println("Decisão: Reduzir velocidade de concretagem e evacuar pessoal não essencial");
         
        }else {
          System.out.println("Status: VERMELHO (CRITICO)");
          System.out.println("Decisão: INTERROMPER IMEDIATEAMENTE: Risco de colapso das escoras.");
         if(cargaAtual>(cargaProjeto*1.2)) {
            System.out.println("ALERTA ADICIONAL: Possivel falha catastrofica iminente. Evacuar area total");
            
         }
        }
        }
        }
    
