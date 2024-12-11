/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Queues;

/**
 *
 * @author Jezuz
 */
import java.util.ArrayList;
import java.util.List;

public class PriorityQueues {
    
    public class VectorOfVectors_PQ<T> {
    private List<List<T>> queue;
    private int maxPriority;

    public VectorOfVectors_PQ(int maxPriority) {
        this.maxPriority = maxPriority;
        queue = new ArrayList<>();

        // Inicializar listas vacías para cada nivel de prioridad
        for (int i = 0; i <= maxPriority; i++) {
            queue.add(new ArrayList<>());
        }
    }

    // Insertar elemento con una prioridad específica
    public void enqueue(T item, int priority) {
        if (priority < 0 || priority > maxPriority) {
            throw new IllegalArgumentException("Priority out of range.");
        }
        queue.get(priority).add(item);
    }

    // Devolver y eliminar el elemento con la prioridad más alta
    public T dequeue() {
        for (int i = maxPriority; i >= 0; i--) {
            if (!queue.get(i).isEmpty()) {
                return queue.get(i).remove(0);
            }
        }
        throw new IllegalStateException("Queue is empty.");
    }

    // Ver el elemento con la prioridad más alta sin eliminarlo
    public T peek() {
        for (int i = maxPriority; i >= 0; i--) {
            if (!queue.get(i).isEmpty()) {
                return queue.get(i).get(0);
            }
        }
        throw new IllegalStateException("Queue is empty.");
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        for (int i = 0; i <= maxPriority; i++) {
            if (!queue.get(i).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    // Obtener el tamaño de la cola
    public int size() {
        int size = 0;
        for (List<T> list : queue) {
            size += list.size();
        }
        return size;
    }

    // Representar la cola como lista de strings
    public List<String> toList() {
        List<String> result = new ArrayList<>();
        for (int i = maxPriority; i >= 0; i--) {
            for (T item : queue.get(i)) {
                result.add("Priority " + i + ": " + item);
            }
        }
        return result;
    }
}
    public class VectorOfLists_PQ<T> {
    private List<T>[] priorityLists;
    private int maxPriority;

    // Constructor
    @SuppressWarnings("unchecked")
    public VectorOfLists_PQ(int maxPriority) {
        if (maxPriority < 0) {
            throw new IllegalArgumentException("Max priority must be non-negative.");
        }

        this.maxPriority = maxPriority;

        // Inicializar el arreglo de listas
        this.priorityLists = new ArrayList[maxPriority + 1];
        for (int i = 0; i <= maxPriority; i++) {
            this.priorityLists[i] = new ArrayList<>();
        }
    }

    // Agregar un elemento con prioridad específica
    public void enqueue(T item, int priority) {
        if (priority < 0 || priority > maxPriority) {
            throw new IllegalArgumentException("Invalid priority.");
        }

        priorityLists[priority].add(item);
    }

    // Eliminar y retornar el elemento con la prioridad más alta
    public T dequeue() {
        for (int i = maxPriority; i >= 0; i--) {
            if (!priorityLists[i].isEmpty()) {
                return priorityLists[i].remove(0);
            }
        }

        throw new IllegalStateException("Queue is empty.");
    }

    // Retorna el elemento con la prioridad más alta sin eliminarlo
    public T peek() {
        for (int i = maxPriority; i >= 0; i--) {
            if (!priorityLists[i].isEmpty()) {
                return priorityLists[i].get(0);
            }
        }

        throw new IllegalStateException("Queue is empty.");
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        for (List<T> list : priorityLists) {
            if (!list.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    // Retorna el tamaño total de la cola
    public int size() {
        int totalSize = 0;

        for (List<T> list : priorityLists) {
            totalSize += list.size();
        }

        return totalSize;
    }

    // Limpia toda la cola
    public void clear() {
        for (List<T> list : priorityLists) {
            list.clear();
        }
    }

    // Convierte la cola en una lista de cadenas para depuración o visualización
    public List<String> toList() {
        List<String> result = new ArrayList<>();

        for (int i = maxPriority; i >= 0; i--) {
            for (T item : priorityLists[i]) {
                result.add("Priority " + i + ": " + item);
            }
        }

        return result;
    }
}
    public class ListOfLists_PQ<T> {
    private List<List<T>> queue;
    private int maxPriority;

    public ListOfLists_PQ(int maxPriority) {
        this.maxPriority = maxPriority;
        queue = new ArrayList<>();

        for (int i = 0; i <= maxPriority; i++) {
            queue.add(new ArrayList<>());
        }
    }

    public void enqueue(T item, int priority) {
        if (priority < 0 || priority > maxPriority) {
            throw new IllegalArgumentException("Invalid priority.");
        }
        queue.get(priority).add(item);
    }

    public T dequeue() {
        for (int i = maxPriority; i >= 0; i--) {
            if (!queue.get(i).isEmpty()) {
                return queue.get(i).remove(0);
            }
        }
        throw new IllegalStateException("Queue is empty.");
    }

    public T peek() {
        for (int i = maxPriority; i >= 0; i--) {
            if (!queue.get(i).isEmpty()) {
                return queue.get(i).get(0);
            }
        }
        throw new IllegalStateException("Queue is empty.");
    }

    public boolean isEmpty() {
        return queue.stream().allMatch(List::isEmpty);
    }

    public int size() {
        return queue.stream().mapToInt(List::size).sum();
    }

    public List<String> toList() {
        List<String> result = new ArrayList<>();
        for (int i = maxPriority; i >= 0; i--) {
            for (T item : queue.get(i)) {
                result.add("Priority " + i + ": " + item);
            }
        }
        return result;
    }
}
    public class ListOfVectors_PQ<T> {
    private List<T[]> queue;
    private int maxPriority;

    // Constructor
    public ListOfVectors_PQ(int maxPriority) {
        this.maxPriority = maxPriority;
        this.queue = new ArrayList<>();

        // Inicializar la lista de arreglos con arreglos vacíos
        for (int i = 0; i <= maxPriority; i++) {
            queue.add((T[]) new Object[0]); // Crear arreglos vacíos
        }
    }

    // Método para encolar un elemento con prioridad
    public void enqueue(T item, int priority) {
        if (priority < 0 || priority > maxPriority) {
            throw new IllegalArgumentException("Invalid priority.");
        }

        T[] currentArray = queue.get(priority);

        // Crear un nuevo arreglo con espacio adicional
        T[] newArray = (T[]) new Object[currentArray.length + 1];
        System.arraycopy(currentArray, 0, newArray, 0, currentArray.length);

        // Agregar el nuevo elemento al final
        newArray[currentArray.length] = item;

        // Reemplazar el arreglo actualizado en la lista
        queue.set(priority, newArray);
    }

    // Método para desencolar el elemento con la prioridad más alta
    public T dequeue() {
        for (int i = maxPriority; i >= 0; i--) {
            T[] currentArray = queue.get(i);

            if (currentArray.length > 0) {
                T item = currentArray[0];

                // Crear un nuevo arreglo sin el primer elemento
                T[] newArray = (T[]) new Object[currentArray.length - 1];
                System.arraycopy(currentArray, 1, newArray, 0, newArray.length);

                // Actualizar el arreglo en la lista
                queue.set(i, newArray);

                return item;
            }
        }
        throw new IllegalStateException("Queue is empty.");
    }

    // Método para obtener el elemento con la prioridad más alta sin eliminarlo
    public T peek() {
        for (int i = maxPriority; i >= 0; i--) {
            T[] currentArray = queue.get(i);

            if (currentArray.length > 0) {
                return currentArray[0];
            }
        }
        throw new IllegalStateException("Queue is empty.");
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        for (int i = 0; i <= maxPriority; i++) {
            if (queue.get(i).length > 0) {
                return false;
            }
        }
        return true;
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        int size = 0;

        for (T[] array : queue) {
            size += array.length;
        }

        return size;
    }

    // Método para convertir la cola en una lista de cadenas
    public List<String> toList() {
        List<String> result = new ArrayList<>();

        for (int i = queue.size() - 1; i >= 0; i--) {
            T[] array = queue.get(i);
            for (T item : array) {
                result.add("Priority " + i + ": " + item);
            }
        }

        return result;
    }
}
}
