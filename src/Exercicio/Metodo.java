package Exercicio;

public class Metodo {
    public static int par(int v[]){
        int count = 0;
        for(int x: v) if(x % 2 == 0) count++;
        return count;
    }

    public static int maior(int v[]){
        int maior = v[0];
        for(int i = 0; i < v.length;i++){
            if(v[i] > maior){
                maior = v[i];
            }
        }
        return maior;
    }

    public static int menor(int v[]){
        int menor = v[0];
        for(int i = 0; i < v.length;i++){
            if(v[i] < menor){
                menor = v[i];
            }
        }
        return menor;
    }

    public static int positivo(int v[]){
        int positivo=0;
        for(int x:v) if(x >= 0) positivo++;
        return positivo;
    }

    public static int negativo(int v[]){
        int negativo = 0;
        for(int x:v) if(x <0) negativo ++;
        return negativo;
    }

    public static int primo(int v[]){
        boolean validacao;
        int count =0;
        for (int x :v ) {
            validacao = true;
            if(x < 0) x *= (-1);

            if(x == 0 || x == 1) validacao = false;

            for (int y = 2; y < x; y++) {
                if (x % y == 0) {
                    validacao = false;
                    break;
                }
            }
            if(validacao) count++;
        }
        return count;
    }

    public static int multiplo(int x, int v[]){
        int divisivel=0;
        for(int z: v){
            if(z % x == 0){
                divisivel++;
            }
        }
        return divisivel;
    }

    public static void duplicado(int v[]){
        int count = 0;
        int igual[] = new int[v.length];
        for(int x = 0; x<v.length; x++){
            for(int p = 0; p<v.length; p++){
                if(x == p) break;
                if(v[x] == v[p]) count++;
            }
        }
        if(count !=0)
            System.out.printf("Existe numeros duplicados");
        else
            System.out.println("Nao existe numeros duplicados");

    }
}
