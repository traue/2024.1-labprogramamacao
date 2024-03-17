public class Main {
                public static void main(String[] args) {
                                double vCompra = 1100;
                                double vPagamento = 1881.93d;
                               
                                //vars para notas:
                                int n200 = 0;
                                int n100 = 0;
                                int n50 = 0;
                                int n20 = 0;
                                int n10 = 0;
                                int n5 = 0;
                                int n2 = 0;
                               
                                //moedas
                                int m1 = 0;
                                int m50 = 0;
                                int m25 = 0;
                                int m10 = 0;
                                int m5 = 0;
                                int m01 = 0;
                               
                                double troco = vPagamento - vCompra;
                                System.out.println("Troco: "+ troco);
                                System.out.println("Decompondo o troco....");
                               
                                //200
                                if (troco >= 200) {
                                    n200 = (int)troco / 200;
                                    System.out.println(n200 + " notas de 200");
                                    int desconto = (n200 * 200);
                                    System.out.println("Descontando.... " + desconto);
                                    troco -= desconto;
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                //100
                                if (troco >= 100) {
                                    n100 = (int)troco / 100;
                                    System.out.println(n100 + " notas de 100");
                                    troco -= (n100 * 100); //troco = troco - (n100 * 100)
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                //50
                                if (troco >= 50) {
                                    n50 = (int)troco / 50;
                                    System.out.println(n50 + " notas de 50");
                                    troco -= (n50 * 50);
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                //20
                                if (troco >= 20) {
                                    n20 = (int)troco / 20;
                                    System.out.println(n20 + " notas de 20");
                                    troco -= (n20 * 20);
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                //10
                                if (troco >= 10) {
                                    n10 = (int)troco / 10;
                                    System.out.println(n10 + " notas de 10");
                                    troco -= (n10 * 10);
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                //5
                                if (troco >= 5) {
                                    n5 = (int)troco / 5;
                                    System.out.println(n5 + " notas de 5");
                                    troco -= (n5 * 5);
                                    System.out.println("Troco faltante: "+ troco);
                                }
                                
                                //2
                                if (troco >= 2) {
                                    n2 = (int)troco / 2;
                                    System.out.println(n2 + " notas de 2");
                                    troco -= (n2 * 2);
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                //moedas
                                if (troco >= 1) {
                                    m1 = (int)troco;
                                    System.out.println(m1 + " moedas de 1");
                                    troco -= m1;
                                     System.out.println("Troco faltante: "+ troco);
                                }
                               
                                if (troco >= 0.5) {
                                    m50 = (int)(troco / 0.5f);
                                    System.out.println(m50 + " moedas de 0.50");
                                    troco -= (m50 * 0.5);
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                if (troco >= 0.25) {
                                    m25 = (int)(troco / 0.25f);
                                    System.out.println(m25 + " moedas de 0.25");
                                    troco -= (m25 * 0.25);
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                if (troco >= 0.10) {
                                    m10 = (int)(troco / 0.1f);
                                    System.out.println(m10 + " moedas de 0.10");
                                    troco -= (m10 * 0.1);
                                    System.out.println("Troco faltante: "+ troco);
                                }
                               
                                if (troco >= 0.01) {
                                    m01 = (int)(troco / 0.01f);
                                    System.out.println(m01 + " moedas de 0.01");
                                    troco -= (m01 * 0.1);
                                }
                }
}
