import java.util.Arrays;

public class ImplementacaoDesafio {

    public static void main(String[] args) {
        ImplementacaoDesafio im = new ImplementacaoDesafio();
        int v[] = {5,3,2,4,7,1,0,6};

        im.ordenarVetorUtilizandoBubbleSort(v);
        im.imprimirVetorOrdenado(v);
    }

    void ordenarVetorUtilizandoBubbleSort(int v[])
    {
        int i, j, aux;

        for(i=0; i<v.length; i++){
            for(j=0; j<v.length-1; j++){
                if(v[j]>v[j+1]) {
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        }
    }

    void imprimirVetorOrdenado(int v[]){
        Arrays.stream(v).forEach(System.out::println);
    }

}
