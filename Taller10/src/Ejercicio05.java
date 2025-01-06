
public class Ejercicio05 {

    public static void main(String[] args) {
        String[][] nombres = new String[3][3];
        double[][] precios = new double[3][3];
        int[][] cantidades = new int[3][3];

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion, cantidad, cantidadDeseada;
        String nombre, nombreBuscar;
        boolean encontrado, espacioEncontrado;
        double precio, subtotal, iva, descuento, total;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Procesar venta");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Agregar producto
                    System.out.println("\n=== AGREGAR NUEVO PRODUCTO ===");
                    espacioEncontrado = false;
                    for (int i = 0; i < 3 && !espacioEncontrado; i++) {
                        for (int j = 0; j < 3 && !espacioEncontrado; j++) {
                            if (nombres[i][j] == null) {
                                System.out.print("Ingrese el nombre del producto: ");
                                nombre = scanner.next();
                                System.out.print("Ingrese el precio del producto: ");
                                precio = scanner.nextDouble();
                                System.out.print("Ingrese la cantidad inicial: ");
                                cantidad = scanner.nextInt();

                                nombres[i][j] = nombre;
                                precios[i][j] = precio;
                                cantidades[i][j] = cantidad;

                                System.out.println("Producto agregado exitosamente.");
                                espacioEncontrado = true;
                            }
                        }
                    }

                    if (!espacioEncontrado) {
                        System.out.println("Error: El inventario está lleno.");
                    }
                    break;

                case 2: // Actualizar existencias
                    System.out.println("\n=== ACTUALIZAR EXISTENCIAS ===");
                    System.out.print("Ingrese el nombre del producto: ");
                    nombreBuscar = scanner.next();
                    encontrado = false;
                    for (int i = 0; i < 3 && !encontrado; i++) {
                        for (int j = 0; j < 3 && !encontrado; j++) {
                            if (nombres[i][j] != null && nombres[i][j].equalsIgnoreCase(nombreBuscar)) {
                                System.out.print("Ingrese la nueva cantidad: ");
                                cantidades[i][j] = scanner.nextInt();
                                System.out.println("Existencias actualizadas exitosamente.");
                                encontrado = true;
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Error: Producto no encontrado.");
                    }
                    break;

                case 3: // Buscar producto
                    System.out.println("\n=== BUSCAR PRODUCTO ===");
                    System.out.print("Ingrese el nombre del producto: ");
                    nombreBuscar = scanner.next();
                    encontrado = false;
                    for (int i = 0; i < 3 && !encontrado; i++) {
                        for (int j = 0; j < 3 && !encontrado; j++) {
                            if (nombres[i][j] != null && nombres[i][j].equalsIgnoreCase(nombreBuscar)) {
                                System.out.println("\nInformación del producto:");
                                System.out.println("Nombre: " + nombres[i][j]);
                                System.out.println("Precio: $" + String.format("%.2f", precios[i][j]));
                                System.out.println("Cantidad disponible: " + cantidades[i][j]);
                                encontrado = true;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4: // Eliminar producto
                    System.out.println("\n=== ELIMINAR PRODUCTO ===");
                    System.out.print("Ingrese el nombre del producto: ");
                    nombreBuscar = scanner.next();
                    encontrado = false;
                    for (int i = 0; i < 3 && !encontrado; i++) {
                        for (int j = 0; j < 3 && !encontrado; j++) {
                            if (nombres[i][j] != null && nombres[i][j].equalsIgnoreCase(nombreBuscar)) {
                                nombres[i][j] = null;
                                precios[i][j] = 0;
                                cantidades[i][j] = 0;
                                System.out.println("Producto eliminado exitosamente.");
                                encontrado = true;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Error: Producto no encontrado.");
                    }
                    break;

                case 5: // Mostrar inventario
                    System.out.println("\n=== INVENTARIO ACTUAL ===");
                    System.out.println("Nombre\t\tPrecio\tCantidad");
                    System.out.println("--------------------------------");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (nombres[i][j] != null) {
                                System.out.printf("%-10s\t$%.2f\t%d%n",
                                        nombres[i][j],
                                        precios[i][j],
                                        cantidades[i][j]);
                            }
                        }
                    }
                    break;

                case 6: // Procesar venta
                    System.out.println("\n=== PROCESAR VENTA ===");
                    System.out.println("\n=== INVENTARIO ACTUAL ===");
                    System.out.println("Nombre\t\tPrecio\tCantidad");
                    System.out.println("--------------------------------");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (nombres[i][j] != null) {
                                System.out.printf("%-10s\t$%.2f\t%d%n",
                                        nombres[i][j],
                                        precios[i][j],
                                        cantidades[i][j]);
                            }
                        }
                    }
                    System.out.print("\nIngrese el nombre del producto: ");
                    nombreBuscar = scanner.next();
                    encontrado = false;
                    for (int i = 0; i < 3 && !encontrado; i++) {
                        for (int j = 0; j < 3 && !encontrado; j++) {
                            if (nombres[i][j] != null && nombres[i][j].equalsIgnoreCase(nombreBuscar)) {
                                System.out.print("Ingrese la cantidad deseada: ");
                                cantidadDeseada = scanner.nextInt();
                                if (cantidadDeseada > cantidades[i][j]) {
                                    System.out.println("Error: Stock insuficiente. Disponible: " + cantidades[i][j]);
                                } else {
                                    subtotal = precios[i][j] * cantidadDeseada;
                                    iva = subtotal * 0.15;
                                    descuento = subtotal > 100 ? subtotal * 0.10 : 0;
                                    total = subtotal + iva - descuento;
                                    // Actualizar inventario
                                    cantidades[i][j] -= cantidadDeseada;
                                    // Imprimir factura
                                    System.out.println("\n=== FACTURA ===");
                                    System.out.println("Producto: " + nombres[i][j]);
                                    System.out.println("Cantidad: " + cantidadDeseada);
                                    System.out.println("Precio unitario: $" + String.format("%.2f", precios[i][j]));
                                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                                    System.out.println("IVA (15%): $" + String.format("%.2f", iva));
                                    if (descuento > 0) {
                                        System.out.println("Descuento (10%): $" + String.format("%.2f", descuento));
                                    }
                                    System.out.println("Total a pagar: $" + String.format("%.2f", total));
                                }
                                encontrado = true;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Error: Producto no encontrado.");
                    }
                    break;

                case 7:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
/*
=== MEN� PRINCIPAL ===
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Procesar venta
7. Salir
Seleccione una opci�n: 1

=== AGREGAR NUEVO PRODUCTO ===
Ingrese el nombre del producto: Pan
Ingrese el precio del producto: 0.30
Ingrese la cantidad inicial: 200
Producto agregado exitosamente.

=== MEN� PRINCIPAL ===
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Procesar venta
7. Salir
Seleccione una opci�n: 1

=== AGREGAR NUEVO PRODUCTO ===
Ingrese el nombre del producto: Arroz
Ingrese el precio del producto: 3.5
Ingrese la cantidad inicial: 80
Producto agregado exitosamente.

=== MEN� PRINCIPAL ===
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Procesar venta
7. Salir
Seleccione una opci�n: 6

=== PROCESAR VENTA ===

=== INVENTARIO ACTUAL ===
Nombre		Precio	Cantidad
--------------------------------
Pan       	$0.30	200
Arroz     	$3.50	80

Ingrese el nombre del producto: Pan
Ingrese la cantidad deseada: 20

=== FACTURA ===
Producto: Pan
Cantidad: 20
Precio unitario: $0.30
Subtotal: $6.00
IVA (15%): $0.90
Total a pagar: $6.90

=== MEN� PRINCIPAL ===
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Procesar venta
7. Salir
Seleccione una opci�n: 7
�Gracias por usar el sistema!
 */
