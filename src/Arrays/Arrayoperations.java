package Arrays;

import java.util.Scanner;

public class Arrayoperations {
        static int sizecalculation(int size, int size1){
            return Math.max(size, size1);
        }
        int[] additionfor1d(int size,int size1,int[] arr, int[]arr1){
            int maxsize=Arrayoperations.sizecalculation(size, size1);
            int[] sumresult=new int[maxsize];
            if(size<=size1){
                for(int i=0;i<arr1.length;i++){
                    if(i<size){
                        sumresult[i]=arr[i]+arr1[i];
                    }
                    else{
                        sumresult[i]=arr1[i];
                    }
                }
            }
            else if(size1<size){
                for(int j=0;j<arr.length;j++){
                    if(j<arr1.length){
                        sumresult[j]=arr[j]+arr1[j];
                    }
                    else{
                        sumresult[j]=arr[j];
                    }
                }
            }
            return sumresult;
        }
        int[] subtractionof1darray1_array2(int size,int size1,int[] arr,int[] arr1){
            int maxsize=Arrayoperations.sizecalculation(size, size1);
            int[] difference=new int[maxsize];
            if(size<=size1){
                for(int i=0;i<arr1.length;i++){
                    if(i<size){
                        difference[i]=arr[i]-arr1[i];
                    }
                    else{
                        difference[i]=arr1[i];
                    }
                }
            }
            else if(size1<size){
                for(int j=0;j<arr.length;j++){
                    if(j<arr1.length){
                        difference[j]=arr[j]-arr1[j];
                    }
                    else{
                        difference[j]=arr[j];
                    }
                }
            }
            return difference;
        }
        int[] subtractionof1darray2_array1(int size, int size1,int[] arr, int[] arr1){
            int maxsize=Arrayoperations.sizecalculation(size, size1);
            int[] difference=new int[maxsize];
            if(size<=size1){
                for(int i=0;i<arr1.length;i++){
                    if(i<size){
                        difference[i]=arr1[i]-arr[i];
                    }
                    else{
                        difference[i]=arr1[i];
                    }
                }
            }
            else if(size1<size){
                for(int j=0;j<arr.length;j++){
                    if(j<arr1.length){
                        difference[j]=arr1[j]-arr[j];
                    }
                    else{
                        difference[j]=arr[j];
                    }
                }
            }
            return difference;
        }
        int[] subtractionof1darrayabsolute(int size, int size1, int[] arr, int[] arr1){
            int maxsize=Arrayoperations.sizecalculation(size, size1);
            int[] difference=new int[maxsize];
            if(size<=size1){
                for(int i=0;i<arr1.length;i++){
                    if(i<size){
                        if(arr[i]-arr1[i]<0){
                            difference[i]=-(arr[i]-arr1[i]);
                        }
                        else{
                            difference[i]=arr[i]-arr1[i];
                        }
                    }
                    else{
                        difference[i]=arr1[i];
                    }
                }
            }
            else if(size1<size){
                for(int j=0;j<arr.length;j++){
                    if(j<arr1.length){
                        if(arr[j]-arr1[j]<0){
                            difference[j]=-(arr[j]-arr1[j]);
                        }
                        else{
                            difference[j]=arr[j]-arr1[j];
                        }
                    }
                    else{
                        difference[j]=arr[j];
                    }
                }
            }
            return difference;
        }
        int[] multiplicationof1darray(int size, int size1, int[] arr, int[] arr1){
            int maxsize=Arrayoperations.sizecalculation(size, size1);
            int[] multiplyresult=new int[maxsize];
            if(size<=size1){
                for(int i=0;i<arr1.length;i++){
                    if(i<size){
                        multiplyresult[i]=arr[i]*arr1[i];
                    }
                    else{
                        multiplyresult[i]=arr1[i];
                    }
                }
            }
            else if(size1<size){
                for(int j=0;j<arr.length;j++){
                    if(j<arr1.length){
                        multiplyresult[j]=arr[j]*arr1[j];
                    }
                    else{
                        multiplyresult[j]=arr[j];
                    }
                }
            }
            return multiplyresult;
        }
        int[] reversearr(int size, int[] arr){
            int[] reverse1=new int[size];
            int j=0;
            for(int i=size-1; i>=0; i--){
                reverse1[j]=arr[i];
                j++;
            }
            return reverse1;
        }
        int[] reversearr2(int size1, int[] arr1){
            int[] reverse2=new int[size1];
            int j=0;
            for(int i=size1-1; i>=0; i--){
                reverse2[j]=arr1[i];
                j++;
            }
            return reverse2;
        }
        int[][] additionfor2darray(int rows, int columns,int[][] arr1,int[][] arr2){
            int[][] resultant=new int[rows][columns];
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    resultant[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            return resultant;
        }
        int[][] subtractionof2darray(int rows,int columns, int[][] arr1,int[][] arr2){
            int[][] subresult=new int[rows][columns];
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[i].length;j++){
                    subresult[i][j]=arr1[i][j]-arr2[i][j];
                }
            }
            return subresult;
        }
        int[][] multiplicationof2darray(int rows, int columns, int[][] arr1, int[][] arr2){
            int[][] multiplyresult=new int[rows][columns];
            int[][] transposeofarr2=new int[columns][rows];
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[i].length;j++){
                    transposeofarr2[j][i]=arr2[i][j];
                }
            }
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2[i].length;j++){
                    for(int k=0;k<arr1[i].length;k++){
                        multiplyresult[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            return multiplyresult;
        }
        int[][] transposeof2darray1(int rows, int columns, int[][] arr1){
            int[][] transposeresult1=new int[columns][rows];
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[i].length;j++){
                    transposeresult1[j][i]=arr1[i][j];
                }
            }
            return transposeresult1;
        }
        int[][] transposeof2daray2(int rows, int columns, int[][] arr2){
            int[][] transposeresult2=new int[columns][rows];
            for(int i=0;i<arr2.length; i++){
                for(int j=0; j<arr2[i].length; j++){
                    transposeresult2[j][i]=arr2[i][j];
                }
            }
            return transposeresult2;
        }
        public static void main(String[] args){
            Arrayoperations obj=new Arrayoperations();
            Scanner sc =new Scanner(System.in);
            char type;
            while(true){
                System.out.println("=====================================================================");
                System.out.print("Enter the type or array(Either 1 dimensional or 2 dimensional array): ");
                type=sc.next().charAt(0);
                System.out.println("=====================================================================");

                if(type=='1' || type=='2'){
                    break;
                }
                else{
                    System.out.println("\n**Enter a valid array dimension**\n");
                }
            }
            if(type=='1'){
                System.out.print("Enter the size of the first  array: ");
                int size=sc.nextInt();
                System.out.print("Enter the size of the second array: ");
                int size1=sc.nextInt();
                int[] arr=new int[size];
                int[] arr1=new int[size1];
                for(int i=0;i<size;i++){
                    System.out.print("Enter the element of the first array at arr["+i+"]: ");
                    arr[i]=sc.nextInt();
                }
                for(int i=0;i<size1;i++){
                    System.out.print("Enter the element of the second array at arr1["+i+"]: ");
                    arr1[i]=sc.nextInt();
                }
                char type1;
                while(true){
                    System.out.println("===============================================================================================================");
                    System.out.print("Enter the type of operation to be performed between the two arrays elements('+','-','*','R'(reverse an array)): ");
                    type1=sc.next().charAt(0);
                    if(type1=='+' || type1=='-' || type1=='*' || type1=='R'){
                        break;
                    }
                    else{
                        System.out.println("\n**Enter a valid operations**\n");
                    }
                }
                switch(type1){
                    case'+':
                        int[] sumresult1=obj.additionfor1d(size, size1, arr, arr1);
                        System.out.print("\nThe resultant array after addiltion are: ");
                        for(int j:sumresult1){
                            System.out.print(j+" ");
                        }
                        System.out.println();
                        System.out.println("=".repeat(42+(sumresult1.length)));
                        break;
                    case'-':
                        int option;
                        while(true){
                            System.out.println("===============================");
                            System.out.println("You have three options:\n\n1.Array1-Array2\n2.Array2-Array1\n3.Absolute difference:");
                            System.out.print("\nEnter your choice in numbers: ");
                            option=sc.nextInt();
                            if(option==1 || option==2 || option==3){
                                System.out.println("===============================");
                                break;
                            }
                            else{
                                System.out.println("\n**Enter a avalid option**\n");
                            }
                        }
                        switch(option){
                            case 1:
                                int[] result=obj.subtractionof1darray1_array2(size, size1, arr, arr1);
                                System.out.print("The array after Array1 - Array2 is: ");
                                for(int i:result){
                                    System.out.print(i+" ");
                                }
                                System.out.println();
                                System.out.println("=".repeat(35+(result.length)));
                                break;
                            case 2:
                                int[] result1=obj.subtractionof1darray2_array1(size, size1, arr, arr1);
                                System.out.print("The array after Array2 - Array1 is: ");
                                for(int i:result1){
                                    System.out.print(i+" ");
                                }
                                System.out.println();
                                System.out.println("=".repeat(35+(result1.length)));
                                break;
                            case 3:
                                int[] result2=obj.subtractionof1darrayabsolute(size, size1, arr ,arr1);
                                System.out.print("The array after absolute difference is: ");
                                for(int i:result2){
                                    System.out.print(i+" ");
                                }
                                System.out.println();
                                System.out.println("=".repeat(41+(result2.length)));
                        }
                        break;
                    case'*':
                        int[] result=obj.multiplicationof1darray(size, size1, arr, arr1);
                        System.out.print("The array after multiplication of two arrays is: ");
                        for(int i:result){
                            System.out.print(i+" ");
                        }
                        System.out.println();
                        System.out.println("=".repeat(50+(result.length)));
                        break;
                    case'R':
                        int[] result1=obj.reversearr(size, arr);
                        int[] result2=obj.reversearr2(size1, arr1);
                        System.out.print("The reversed array of the first array is: ");
                        for(int i:result1){
                            System.out.print(i+" ");
                        }
                        System.out.println();
                        System.out.print("The reversed array of the second array is: ");
                        for(int j:result2){
                            System.out.print(j+" ");
                        }
                        System.out.println();
                        int maxsize=Arrayoperations.sizecalculation(size,size1);
                        System.out.println("=".repeat(46+maxsize));
                        break;
                    default:
                        System.out.println("Enter a valid operation");
                }
            }
            else if(type=='2'){
                String twodsize;
                int rows;
                int columns;
                String[] rowscolumns;
                sc.nextLine();
                while(true){
                    System.out.print("Enter the size of the two dimensional array(rows,columns): ");
                    twodsize=sc.nextLine().trim();
                    rowscolumns=twodsize.split("\\W+");
                    rows= Integer.parseInt(rowscolumns[0]);
                    columns=Integer.parseInt(rowscolumns[1]);
                    if(rows==columns){
                        break;
                    }
                    else{
                        System.out.println("\n|| Matrix opertions can only be done in a square matrix ||\n");
                    }
                }
                int[][] arr1=new int[rows][columns];
                int[][] arr2=new int[rows][columns];
                System.out.println("<=====For first matrix=====>");
                for(int i=0;i<rows;i++){
                    for(int j=0;j<columns;j++){
                        System.out.print("Enter the element at arr["+i+"]["+j+"]: ");
                        arr1[i][j]=sc.nextInt();
                    }
                }
                System.out.println ("<=====For second matrix=====>");
                for(int i=0;i<rows;i++){
                    for(int j=0;j<columns;j++){
                        System.out.print("Enter the element at ar[" +i+"]["+j+"]: ");
                        arr2[i][j]=sc.nextInt();
                    }
                }
                sc.nextLine();
                char operation;
                System.out.println("==========================================================================================");
                while(true){
                    System.out.print("Enter the type of operation to be performed between these two matrices(+,-,*,T(transpose)): ");
                    operation=sc.next().charAt(0);
                    if(operation=='+' || operation=='-' || operation=='*' || operation=='T'){
                        break;
                    }
                    else{
                        System.out.println("\n|| Enter a valid operation ||\n");
                    }
                }
                switch(operation){
                    case '+':
                        int[][] result=obj.additionfor2darray(rows, columns, arr1, arr2);
                        for(int i=0;i<result.length;i++){
                            for(int j=0;j<result[i].length;j++){
                                System.out.print(result[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case'-':
                        int[][] result1=obj.subtractionof2darray(rows, columns, arr1, arr2);
                        for(int i=0;i<result1.length;i++){
                            for(int j=0; j<result1[i].length;j++){
                                System.out.print(result1[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case'*':
                        int[][] result2=obj.multiplicationof2darray(rows, columns, arr1, arr2);
                        for(int i=0;i<result2.length;i++){
                            for(int j=0;j<result2[i].length;j++){
                                System.out.print(result2[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case'T':
                        System.out.println("Transpose of first matrix is=====>");
                        int[][] transposeresult=obj.transposeof2darray1(rows, columns, arr1);
                        for(int i=0;i<transposeresult.length;i++){
                            for(int j=0;j<transposeresult[i].length;j++){
                                System.out.print(transposeresult[i][j]+ " ");
                            }
                            System.out.println();
                        }
                        System.out.println("Transpose of second matrix is=====>");
                        int[][] transposeresult2=obj.transposeof2daray2(rows, columns, arr2);
                        for(int i=0;i<transposeresult2.length; i++){
                            for(int j=0;j<transposeresult2[i].length;j++){
                                System.out.print(transposeresult2[i][j]+" ");
                            }
                            System.out.println();
                        }
                        break;
                    default:
                        System.out.println("Enter a valid operation");
                }
            }
        }
}
