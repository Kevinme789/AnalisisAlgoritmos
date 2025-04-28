## Semana 3
### Realizar el ejercicio propuesto en java

![image](https://github.com/user-attachments/assets/ff65d673-1910-49c8-b427-be4a8a67fa4c)

``` java
public class AnalisisAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {3, 4, 7, 3};
        int p = 1, q = 2, r = 4;
        int n = q - p + 1; //nL
        int m = r - q;     //nR
        int[] l = new int[n]; //L
        int[] ra = new int[m]; //R

        for (int i = 0; i < n; i++) {
            l[i] = a[p + i - 1];
        }
        for (int j = 0; j < m; j++) {
            ra[j] = a[q + j];
        }
        int i = 0, j = 0, k = p;
        while (i < n && j < m) {
            if (l[i] <= ra[j]) {
                a[k] = l[i];
                i = i + 1;
            } else {
                a[k] = ra[j];
                j = j + 1;
            }
            k = k + 1;
        }
        i = 0;
        k = 0;
        while (i < n) {
            a[k] = l[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < m) {
            a[k] = ra[j];
            j = j + 1;
            k = k + 1;
        }
        for (int o = 0; o < n; o++) {
            System.out.printf(l[o] + " ");
        }
        System.out.println("");
        for (int o = 0; o < m; o++) {
            System.out.printf(ra[o] + " ");
        }
        System.out.println("");
        for (int o = 0; o < r; o++) {
            System.out.printf(a[o] + " ");
        }
        System.out.println("");

    }

}
```
## Resultados

<img width="278" alt="image" src="https://github.com/user-attachments/assets/ee8bfc6e-15a1-4185-864a-47d56e1083b7" />


