
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        String[][] inventario = new String[99][3];
        int numpro = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" --MENU INVENTARIO-- ");
            System.out.println("1. Nuevo producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Mostrar inventario");
            System.out.print("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    if (numpro < 100) {
                        System.out.print("Nombre del producto: ");
                        inventario[numpro][0] = scanner.nextLine();
                        System.out.print("Precio del producto: ");
                        inventario[numpro][1] = scanner.nextLine();
                        System.out.print("Cantidad del producto: ");
                        inventario[numpro][2] = scanner.nextLine();
                        numpro++;
                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("Inventario lleno. No se pueden agregar más productos.");
                    }
                    break;
                case 2:
                    System.out.print("Nombre del producto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    boolean encontradoActualizar = false;
                    for (int i = 0; i < numpro; i++) {
                        if (inventario[i][0].equals(nombreActualizar)) {
                            System.out.print("Nuevo precio: ");
                            inventario[i][1] = scanner.nextLine();
                            System.out.print("Nueva cantidad: ");
                            inventario[i][2] = scanner.nextLine();
                            encontradoActualizar = true;
                            System.out.println("Producto actualizado exitosamente.");
                            break;
                        }
                    }
                    if (!encontradoActualizar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontradoBuscar = false;
                    for (int i = 0; i < numpro; i++) {
                        if (inventario[i][0].equals(nombreBuscar)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + inventario[i][0]);
                            System.out.println("Precio: " + inventario[i][1]);
                            System.out.println("Cantidad: " + inventario[i][2]);
                            encontradoBuscar = true;
                            break;
                        }
                    }
                    if (!encontradoBuscar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    boolean encontradoEliminar = false;
                    for (int i = 0; i < numpro; i++) {
                        if (inventario[i][0].equals(nombreEliminar)) {
                            for (int j = i; j < numpro - 1; j++) {
                                inventario[j][0] = inventario[j + 1][0];
                                inventario[j][1] = inventario[j + 1][1];
                                inventario[j][2] = inventario[j + 1][2];
                            }
                            numpro--;
                            encontradoEliminar = true;
                            System.out.println("Producto eliminado exitosamente.");
                            break;
                        }
                    }
                    if (!encontradoEliminar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Inventario actual:");
                    for (int i = 0; i < numpro; i++) {
                        System.out.println("Nombre: " + inventario[i][0] + ", Precio: " + inventario[i][1] + ", Cantidad: " + inventario[i][2]);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}
/*
--MENU INVENTARIO-- 
1. Nuevo producto
2. Actualizar producto
3. Buscar
4. Eliminar
5. Mostrar inventario
Selecciona una opcion: 1
Nombre del producto: Pan
Precio del producto: 0.35
Cantidad del producto: 200
Producto agregado exitosamente.
 --MENU INVENTARIO-- 
1. Nuevo producto
2. Actualizar producto
3. Buscar
4. Eliminar
5. Mostrar inventario
Selecciona una opcion: 3
Nombre del producto a buscar: Pan
Producto encontrado:
Nombre: Pan
Precio: 0.35
Cantidad: 200
 --MENU INVENTARIO-- 
1. Nuevo producto
2. Actualizar producto
3. Buscar
4. Eliminar
5. Mostrar inventario
Selecciona una opcion: 2
Nombre del producto a actualizar: Pan
Nuevo precio: 0.40
Nueva cantidad: 150
Producto actualizado exitosamente.
 --MENU INVENTARIO-- 
1. Nuevo producto
2. Actualizar producto
3. Buscar
4. Eliminar
5. Mostrar inventario
Selecciona una opcion: 5
Inventario actual:
Nombre: Pan, Precio: 0.40, Cantidad: 150
 --MENU INVENTARIO-- 
1. Nuevo producto
2. Actualizar producto
3. Buscar
4. Eliminar
5. Mostrar inventario
Selecciona una opcion: 
*/
