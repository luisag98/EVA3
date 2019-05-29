/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.nanoTime();
        int[] aiDatos = new int[50];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 100 + 1);
        }
        long iIni, iFin, iResu;
        
        imprimir(aiDatos);
        // selectionSort(aiDatos);
        iIni = System.nanoTime();        
        insertionSort(aiDatos);
        iResu = System.nanoTime() - iIni;        
        imprimir(aiDatos);
        System.out.println("INSERTION " + iResu);
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 100 + 1);
        }        
        iIni = System.nanoTime();                
        bubbleSort(aiDatos);
        iResu = System.nanoTime() - iIni;        
        imprimir(aiDatos);
        System.out.println("BUBBLESORT " + iResu);
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 100 + 1);
        }        
        iIni = System.nanoTime(); 
        selectionSort(aiDatos);
        iResu = System.nanoTime() - iIni;        
        imprimir(aiDatos);
        System.out.println("SELECTION " + iResu);
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 100 + 1);
        }        
        iIni = System.nanoTime();                
        quickSort(aiDatos, 0, aiDatos.length-1);        
        iResu = System.nanoTime() - iIni;        
        imprimir(aiDatos);        
        System.out.println("QUICKSORT " + iResu);
        
    }
    
    
public static void quickSort(int[] arr, int start, int end){
 
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
 
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
    }
    
    public static void bubbleSort(int[] aiDatos){
        int iTemp = 0;
        for (int i = 0; i < aiDatos.length; i++) {
            for (int j = i+1; j < aiDatos.length -1; j++) {
                if(aiDatos[i] > aiDatos[j]){
                    iTemp = aiDatos[i];
                    aiDatos[i] = aiDatos[j];
                    aiDatos[j] = iTemp;
                }
            }
        }
    }
    
    
    public static void selectionSort(int[] aiDatos){
        int n = aiDatos.length;
        for (int i = 0; i < n-1; i++) {
            int iMin = i;
            for (int j = i + 1; j < n; j++) {
                if(aiDatos[j] < aiDatos[iMin]){
                    iMin = j;
                }
            }
            if(iMin != i){
                int iTemp = aiDatos[i];
                aiDatos[i] = aiDatos[iMin];
                aiDatos[iMin] = iTemp;
            }
        }
    }
    
    public static void imprimir(int[] aiDatos){
        for (int aiDato : aiDatos) {
            System.out.print("[" +aiDato+ "]");
        }
        System.out.println("");
    }
    
    public static void insertionSort(int[] aiDatos){
        for (int i = 1; i < aiDatos.length; i++) {
            int iPrev = i-1;
            int iTemp = aiDatos[i];
            int insP = i;
            while(aiDatos[iPrev]>iTemp && insP>=0){
                aiDatos[insP] = aiDatos[iPrev];
                aiDatos[iPrev] = iTemp;
                insP--;
            }
        }
    }
}
