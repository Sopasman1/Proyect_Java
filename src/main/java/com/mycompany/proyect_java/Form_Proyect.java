/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyect_java;

import com.mycompany.proyect_java.Binarytree.BinaryTree;
import com.mycompany.proyect_java.Graph.Edge;
import com.mycompany.proyect_java.Graph.Graph;
import com.mycompany.proyect_java.Graph.GraphNode;
import com.mycompany.proyect_java.Lists.CircularLinkedList;
import com.mycompany.proyect_java.Lists.DoublyCircularLinkedList;
import com.mycompany.proyect_java.Lists.DoublyLinkedList;
import com.mycompany.proyect_java.Lists.LinkedList;
import com.mycompany.proyect_java.Nodes.DoubleNode;
import com.mycompany.proyect_java.Nodes.Node;
import com.mycompany.proyect_java.Queues.CircularQueue;
import com.mycompany.proyect_java.Queues.DoubleEndedDynamicQueue;
import com.mycompany.proyect_java.Queues.DoubleEndedStaticQueue;
import com.mycompany.proyect_java.Queues.DynamicQueue;
import com.mycompany.proyect_java.Queues.PriorityQueues;
import com.mycompany.proyect_java.Queues.PriorityQueues.ListOfLists_PQ;
import com.mycompany.proyect_java.Queues.PriorityQueues.ListOfVectors_PQ;
import com.mycompany.proyect_java.Queues.PriorityQueues.VectorOfLists_PQ;
import com.mycompany.proyect_java.Queues.PriorityQueues.VectorOfVectors_PQ;
import com.mycompany.proyect_java.Queues.StaticQueue;
import com.mycompany.proyect_java.Stack.DynamicStacks;
import com.mycompany.proyect_java.Stack.StaticStack;
import com.mycompany.proyect_java.SortingAlgorithms.BubbleSort;
import com.mycompany.proyect_java.SortingAlgorithms.BucketSort;
import com.mycompany.proyect_java.SortingAlgorithms.CocktailSort;
import com.mycompany.proyect_java.SortingAlgorithms.CombSort;
import com.mycompany.proyect_java.SortingAlgorithms.CountingSort;
import com.mycompany.proyect_java.SortingAlgorithms.GnomeSort;
import com.mycompany.proyect_java.SortingAlgorithms.HeapSort;
import com.mycompany.proyect_java.SortingAlgorithms.InsertionSort;
import com.mycompany.proyect_java.SortingAlgorithms.MergeAlgorithms;
import com.mycompany.proyect_java.SortingAlgorithms.PigeonHoleSort;
import com.mycompany.proyect_java.SortingAlgorithms.QuickSort;
import com.mycompany.proyect_java.SortingAlgorithms.RadixSort;
import com.mycompany.proyect_java.SortingAlgorithms.SelectionSort;
import com.mycompany.proyect_java.SortingAlgorithms.ShellSort;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author Jezuz
 */
public class Form_Proyect extends javax.swing.JFrame {
    public LinkedList linkedlist;
    public DoublyLinkedList doubleLinkedList;
    public CircularLinkedList circularLinkedList;
    public DoublyCircularLinkedList doubleCircularLinkedList;
    public StaticStack staticStack;
    public DynamicStacks dynamicStack;
    public StaticQueue staticQueue;
    public DynamicQueue dynamicQueue;
    public CircularQueue circularQueue;
    public DoubleEndedStaticQueue doubleEndedStaticQueue;
    public DoubleEndedDynamicQueue doubleEndedDynamicQueue;
    public Graph graph;
    public int[] numbers;
    public VectorOfVectors_PQ<Integer> vectorOfVectorsPQ;
    public VectorOfLists_PQ<Integer> vectorOfListsPQ;
    public ListOfLists_PQ<Integer> listOfListsPQ;
    public ListOfVectors_PQ<Integer> listOfVectorsPQ;
    public BinaryTree.Node;
             
    public DefaultListModel<String> listModelSimpleLinkedList;
    public DefaultListModel<String> listModelDoubleList;
    public DefaultListModel<String> listModelCircularList;
    public DefaultListModel<String> listModelDoubleCircularList;
    public DefaultListModel<String> listModelStaticStack;
    public DefaultListModel<String> listModelDynamicStack;
    private Object MessageBox;
    /**
     * Creates new form Form_Proyect
     */
    public Form_Proyect() {
        initComponents();
        linkedlist = new LinkedList();
        doubleLinkedList = new DoublyLinkedList();
        circularLinkedList = new CircularLinkedList();
        doubleCircularLinkedList = new DoublyCircularLinkedList();
        staticStack = new StaticStack();
        dynamicStack = new DynamicStacks();
        staticQueue = new StaticQueue(5);
        dynamicQueue = new DynamicQueue();
        circularQueue = new CircularQueue(5);
        doubleEndedStaticQueue = new DoubleEndedStaticQueue(5);
        doubleEndedDynamicQueue = new DoubleEndedDynamicQueue();
        graph = new Graph();
        numbers = new int[] { };
        vectorOfVectorsPQ = new VectorOfVectors_PQ<Integer>();
        vectorOfListsPQ = new VectorOfLists_PQ<Integer>();
        listOfListsPQ = new ListOfLists_PQ<Integer>();
        listOfVectorsPQ = new ListOfVectors_PQ<Integer>();
        root = new BinaryTree.Node
        
        listModelSimpleLinkedList = new DefaultListModel<>();
        listModelDoubleList = new DefaultListModel<>();
        listModelCircularList = new DefaultListModel<>();
        listModelDoubleCircularList = new DefaultListModel<>();
        listModelStaticStack = new DefaultListModel<>();
        listModelDynamicStack = new DefaultListModel<>();
        
        lstDynamicStack.setModel(listModelDynamicStack);
        lstStaticStack.setModel(listModelStaticStack);
        lstSimpleLinkedList.setModel(listModelSimpleLinkedList);
        lstDoubleList.setModel(listModelDoubleList);
        lstCircularList.setModel(listModelCircularList);
        lstDoubleCircularList.setModel(listModelDoubleCircularList);
        
        String[] algorithms = {
     "Gnome Sort", "Heap Sort", "Pigeonhole Sort", "Bubble Sort", "Cocktail Sort", 
     "Insertion Sort", "Radix MSD Sort", "Radix LSD Sort", "Shell Sort", 
     "Selection Sort", "Quick Sort", "Merge Sort", "Direct Merge", "Natural Merge", 
     "Comb Sort", "Counting Sort", "Bucket Sort"
     };

     // Add items to the combo box
     for (String algorithm : algorithms) {
     cmbAlgorithms.addItem(algorithm);
     }

     // Set the selected index to the first item (index 0)
     cmbAlgorithms.setSelectedIndex(0);
           
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        BtnRemove = new javax.swing.JButton();
        BtnContains = new javax.swing.JButton();
        BtnCout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSimpleLinkedList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstDoubleList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstCircularList = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstDoubleCircularList = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtStackValue = new javax.swing.JTextField();
        btnPop = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        btnSize = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstStaticStack = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDynamicStack = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtValueSimpleQueue = new javax.swing.JTextField();
        btnDequeue = new javax.swing.JButton();
        btnPeekQueue = new javax.swing.JButton();
        btnEnqueue = new javax.swing.JButton();
        btnSizeQueue = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstStaticQueue = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstDynamicQueue = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        lstCircularQueue = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnInsertFront = new javax.swing.JButton();
        btnGetFront = new javax.swing.JButton();
        btnInsertRear = new javax.swing.JButton();
        btnDeleteFront = new javax.swing.JButton();
        btnDeleteRear = new javax.swing.JButton();
        btnGetRear = new javax.swing.JButton();
        btnSizeDoubleQueue = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        lstQueueDobleVector = new javax.swing.JList<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        lstQueueDoubleList = new javax.swing.JList<>();
        txtQueueDoubleValue = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtQueuePriorityValue = new javax.swing.JTextField();
        txtPriorityQueueLevel = new javax.swing.JTextField();
        btnEnqueuePriorityQueue = new javax.swing.JButton();
        btnDequeuePriorityQueue = new javax.swing.JButton();
        btnPeekPriorityQueue = new javax.swing.JButton();
        btnPriorityQueueSize = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        lstPriorityQueueVV = new javax.swing.JList<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        lstPriorityQueueVL = new javax.swing.JList<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        lstPriorityQueueLV = new javax.swing.JList<>();
        jScrollPane15 = new javax.swing.JScrollPane();
        lstPriorityQueueLL = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btnInsertNode = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnPostOrder = new javax.swing.JButton();
        btnPreOrder = new javax.swing.JButton();
        btnInOrder = new javax.swing.JButton();
        txtNodeValue = new javax.swing.JTextField();
        txtOutput = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        panelTree = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNode = new javax.swing.JTextField();
        btnAddNode = new javax.swing.JButton();
        btnRemoveNode = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        chkDirected = new javax.swing.JCheckBox();
        btnAddEdge = new javax.swing.JButton();
        btnRemoveEdge = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtStartNode = new javax.swing.JTextField();
        btnShowDFS = new javax.swing.JButton();
        btnShowBFS = new javax.swing.JButton();
        btnShowDFSRecursive = new javax.swing.JButton();
        btnRemoveAll = new javax.swing.JButton();
        txtGraphRepresentation = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        cmbAlgoritms = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        btnSetNumbers = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        lstNumbersSort = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Value:");

        BtnRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnRemove.setText("Remove");
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });

        BtnContains.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnContains.setText("Contains");
        BtnContains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContainsActionPerformed(evt);
            }
        });

        BtnCout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCout.setText("Cout");
        BtnCout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoutActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Simple LinkedList");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Double List");

        jScrollPane3.setViewportView(lstSimpleLinkedList);

        jScrollPane4.setViewportView(lstDoubleList);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Circular List");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Double Circular List");

        jScrollPane5.setViewportView(lstCircularList);

        jScrollPane6.setViewportView(lstDoubleCircularList);

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnContains, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(BtnCout, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)
                                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(BtnContains, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(BtnCout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lists", jPanel2);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Value:");

        btnPop.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        btnPeek.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPeek.setText("Peek");
        btnPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekActionPerformed(evt);
            }
        });

        btnSize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSize.setText("Size");
        btnSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeActionPerformed(evt);
            }
        });

        btnPush.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstStaticStack);

        jScrollPane2.setViewportView(lstDynamicStack);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Static stack");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Dynamic stack");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txtStackValue, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(btnPush, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStackValue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(btnPop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Stack", jPanel1);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Value:");

        btnDequeue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDequeue.setText("Dequeue");
        btnDequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDequeueActionPerformed(evt);
            }
        });

        btnPeekQueue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPeekQueue.setText("Peek");
        btnPeekQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekQueueActionPerformed(evt);
            }
        });

        btnEnqueue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnqueue.setText("Enqueue");
        btnEnqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnqueueActionPerformed(evt);
            }
        });

        btnSizeQueue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSizeQueue.setText("Size");
        btnSizeQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeQueueActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Static Queue");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Dynamic Queue");

        jScrollPane7.setViewportView(lstStaticQueue);

        jScrollPane8.setViewportView(lstDynamicQueue);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Circular Queue");

        jScrollPane9.setViewportView(lstCircularQueue);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtValueSimpleQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnqueue, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPeekQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSizeQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(txtValueSimpleQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEnqueue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnPeekQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addComponent(btnSizeQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addComponent(jScrollPane9)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane7)))
                .addGap(108, 108, 108))
        );

        jTabbedPane2.addTab("Simple and Circular", jPanel4);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Value:");

        btnInsertFront.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertFront.setText("Insert Front");
        btnInsertFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertFrontActionPerformed(evt);
            }
        });

        btnGetFront.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGetFront.setText("Get Front");
        btnGetFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetFrontActionPerformed(evt);
            }
        });

        btnInsertRear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertRear.setText("Insert Rear");
        btnInsertRear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertRearActionPerformed(evt);
            }
        });

        btnDeleteFront.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteFront.setText("Delete Front");
        btnDeleteFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFrontActionPerformed(evt);
            }
        });

        btnDeleteRear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteRear.setText("Delete Rear");
        btnDeleteRear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRearActionPerformed(evt);
            }
        });

        btnGetRear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGetRear.setText("Get Rear");
        btnGetRear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetRearActionPerformed(evt);
            }
        });

        btnSizeDoubleQueue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSizeDoubleQueue.setText("Size");
        btnSizeDoubleQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeDoubleQueueActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Whit Vectors");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("With Lists");

        jScrollPane10.setViewportView(lstQueueDobleVector);

        jScrollPane11.setViewportView(lstQueueDoubleList);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQueueDoubleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnInsertFront, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInsertRear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnDeleteFront, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteRear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnGetFront, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGetRear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnSizeDoubleQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel15)
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtQueueDoubleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertFront, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertRear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteFront, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteRear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGetFront, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGetRear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSizeDoubleQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Double", jPanel6);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Value:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("Level:");

        btnEnqueuePriorityQueue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnqueuePriorityQueue.setText("Enqueue");
        btnEnqueuePriorityQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnqueuePriorityQueueActionPerformed(evt);
            }
        });

        btnDequeuePriorityQueue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDequeuePriorityQueue.setText("Dequeue");
        btnDequeuePriorityQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDequeuePriorityQueueActionPerformed(evt);
            }
        });

        btnPeekPriorityQueue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPeekPriorityQueue.setText("Peek");
        btnPeekPriorityQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekPriorityQueueActionPerformed(evt);
            }
        });

        btnPriorityQueueSize.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPriorityQueueSize.setText("Size");
        btnPriorityQueueSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriorityQueueSizeActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("With Vectors of Vector");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("With Vectors of lists");

        jScrollPane12.setViewportView(lstPriorityQueueVV);

        jScrollPane13.setViewportView(lstPriorityQueueVL);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("With lists of vectors");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("With lists of lists");

        jScrollPane14.setViewportView(lstPriorityQueueLV);

        jScrollPane15.setViewportView(lstPriorityQueueLL);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPriorityQueueSize, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPriorityQueueLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel16)))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(txtQueuePriorityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEnqueuePriorityQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDequeuePriorityQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPeekPriorityQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addGap(73, 73, 73))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(62, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQueuePriorityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnqueuePriorityQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel17))
                    .addComponent(btnDequeuePriorityQueue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPriorityQueueLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeekPriorityQueue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPriorityQueueSize, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Priority", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );

        jTabbedPane1.addTab("Queues", jPanel3);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setText("Node Value:");

        btnInsertNode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertNode.setText("Insert");
        btnInsertNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertNodeActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnPostOrder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPostOrder.setText("Post Order");
        btnPostOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrderActionPerformed(evt);
            }
        });

        btnPreOrder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPreOrder.setText("Pre Order");
        btnPreOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrderActionPerformed(evt);
            }
        });

        btnInOrder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInOrder.setText("In Orden");
        btnInOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrderActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setText("Clear Tree");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTreeLayout = new javax.swing.GroupLayout(panelTree);
        panelTree.setLayout(panelTreeLayout);
        panelTreeLayout.setHorizontalGroup(
            panelTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        panelTreeLayout.setVerticalGroup(
            panelTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnInsertNode, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btnPostOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnInOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNodeValue)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnPreOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(682, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNodeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertNode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPostOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(panelTree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(213, Short.MAX_VALUE)
                    .addComponent(btnPreOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(187, 187, 187)))
        );

        jTabbedPane1.addTab("Binary Tree", jPanel5);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setText("Nodes");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Node Name:");

        btnAddNode.setText("Add Node");
        btnAddNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNodeActionPerformed(evt);
            }
        });

        btnRemoveNode.setText("Remove");
        btnRemoveNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveNodeActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setText("Edges");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Node From:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Node to:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Weight:");

        chkDirected.setText("Directed");

        btnAddEdge.setText("Add Edge");
        btnAddEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEdgeActionPerformed(evt);
            }
        });

        btnRemoveEdge.setText("Remove Edge");
        btnRemoveEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEdgeActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setText("Traversals");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Node Start:");

        btnShowDFS.setText("Show DFS Algorithm");
        btnShowDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDFSActionPerformed(evt);
            }
        });

        btnShowBFS.setText("Show Bfs Algorithm");
        btnShowBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowBFSActionPerformed(evt);
            }
        });

        btnShowDFSRecursive.setText("Shoe DFS Recursive");
        btnShowDFSRecursive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDFSRecursiveActionPerformed(evt);
            }
        });

        btnRemoveAll.setText("Remove All");
        btnRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtStartNode))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(jLabel29)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnShowBFS)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowDFS)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowDFSRecursive))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnAddNode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoveNode))
                            .addComponent(txtNode, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkDirected)
                                    .addComponent(txtTo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(txtFrom)
                                    .addComponent(txtWeight))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoveEdge)
                            .addComponent(btnAddEdge))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveAll)
                    .addComponent(txtGraphRepresentation, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(btnRemoveAll))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddNode)
                            .addComponent(btnRemoveNode))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddEdge))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveEdge))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtGraphRepresentation, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(chkDirected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtStartNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowBFS, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnShowDFSRecursive, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnShowDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Graphs", jPanel8);

        btnSort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnSetNumbers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSetNumbers.setText("Generate Numbers");
        btnSetNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetNumbersActionPerformed(evt);
            }
        });

        jScrollPane16.setViewportView(lstNumbersSort);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane16)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(cmbAlgoritms, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnSetNumbers)
                        .addGap(18, 18, 18)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlgoritms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sorting Algorithms", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
        // Verificar si el valor ingresado es un número
        int value = Integer.parseInt(txtValue.getText());

        // Crear un nuevo nodo con el valor ingresado
        Node newNode = new Node(value);
        DoubleNode newDoubleNode = new DoubleNode(value);

        // Agregar el nodo a todas las listas
        linkedlist.add(newNode);
        circularLinkedList.add(newNode);
        doubleLinkedList.add(newDoubleNode);
        doubleCircularLinkedList.add(newDoubleNode);

        // Limpiar los modelos de las listas
        listModelSimpleLinkedList.clear();
        listModelDoubleList.clear();
        listModelCircularList.clear();
        listModelDoubleCircularList.clear();

        // Mostrar los valores en los JList
        showListValues(listModelSimpleLinkedList, linkedlist.getHead());
        showListValues(listModelDoubleList, doubleLinkedList.getHead());
        showListValues(listModelCircularList, circularLinkedList.getHead());
        showListValues(listModelDoubleCircularList, doubleCircularLinkedList.getHead());

        // Limpiar el JTextField después de agregar el nodo
        txtValue.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid numeric value.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
    }
        
}
    private void showListValues(DefaultListModel<String> listModel, Object head) {
    listModel.clear(); // Limpiar el modelo de datos antes de agregar nuevos valores

    if (head instanceof Node) {
        // Manejar lista simple o lista simple circular
        Node current = (Node) head;

        do {
            listModel.addElement(String.valueOf(current.getValue())); // Agregar el valor al modelo
            current = current.getNext();
        } while (current != null && current != head); // Para listas simples y circulares
    } else if (head instanceof DoubleNode) {
        // Manejar lista doble o lista doble circular
        DoubleNode current = (DoubleNode) head;

        do {
            listModel.addElement(String.valueOf(current.getValue())); // Agregar el valor al modelo
            current = current.getNext();
        } while (current != null && current != head); // Para listas dobles y circulares
    }
}

// Método auxiliar para mostrar valores en un DefaultListModel
private void showListValues(DefaultListModel<String> listModel, Node head) {
    Node current = head;
    while (current != null) {
        listModel.addElement(String.valueOf(current.getValue()));
        current = current.getNext();
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
        // TODO add your handling code here:
         try {
        // Intentar convertir el texto ingresado en un número entero
        int value = Integer.parseInt(txtValue.getText());

        // Eliminar el valor de todas las listas
        linkedlist.remove(value);
        doubleLinkedList.remove(value);
        circularLinkedList.remove(value);
        doubleCircularLinkedList.remove(value);

        // Actualizar los modelos de las listas
        showListValues(listModelSimpleLinkedList, linkedlist.getHead());
        showListValues(listModelDoubleList, doubleLinkedList.getHead());
        showListValues(listModelCircularList, circularLinkedList.getHead());
        showListValues(listModelDoubleCircularList, doubleCircularLinkedList.getHead());

        // Limpiar el campo de texto después de eliminar el valor
        txtValue.setText("");
    } catch (NumberFormatException e) {
        // Mostrar un mensaje si el valor ingresado no es un número válido
        JOptionPane.showMessageDialog(this, "Please enter a valid numeric value.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BtnRemoveActionPerformed

    private void BtnContainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContainsActionPerformed
        // TODO add your handling code here:
         try {
        // Intentar convertir el texto ingresado en un número entero
        int value = Integer.parseInt(txtValue.getText());

        // Verificar si el valor está presente en las listas
        boolean inSimpleList = linkedlist.contains(value);
        boolean inDoubleList = doubleLinkedList.contains(value);
        boolean inCircularList = circularLinkedList.contains(value);
        boolean inDoubleCircularList = doubleCircularLinkedList.contains(value);

        // Crear el mensaje para mostrar los resultados
        String message = "Value " + value + " found in:\n" +
                         "- Simple Linked List: " + inSimpleList + "\n" +
                         "- Double Linked List: " + inDoubleList + "\n" +
                         "- Circular Linked List: " + inCircularList + "\n" +
                         "- Double Circular Linked List: " + inDoubleCircularList;

        // Mostrar el mensaje en un cuadro de diálogo
        JOptionPane.showMessageDialog(this, message, "Contains Check", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        // Mostrar un mensaje si el valor ingresado no es un número válido
        JOptionPane.showMessageDialog(this, "Please enter a valid numeric value.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
    }

    // Limpiar el campo de texto después de la verificación
    txtValue.setText("");
    }//GEN-LAST:event_BtnContainsActionPerformed

    private void BtnCoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoutActionPerformed
        // TODO add your handling code here:
        // Contar los nodos en cada lista
    int countSimple = linkedlist.count();
    int countDouble = doubleLinkedList.count();
    int countCircular = circularLinkedList.count();
    int countDoubleCircular = doubleCircularLinkedList.count();

    // Crear el mensaje con los resultados
    String message = """
                     Number of nodes in each list:
                     - Simple Linked List: """ + countSimple + "\n" +
                     "- Double Linked List: " + countDouble + "\n" +
                     "- Circular Linked List: " + countCircular + "\n" +
                     "- Double Circular Linked List: " + countDoubleCircular;

    // Mostrar el mensaje en un cuadro de diálogo
    JOptionPane.showMessageDialog(this, message, "Node Count", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtnCoutActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        // TODO add your handling code here:
        // Verificar si el valor ingresado es un número
    try {
        int value = Integer.parseInt(txtStackValue.getText());
        Node newNode = new Node(Integer.parseInt(txtStackValue.getText()));
        
        // Agregar el valor a ambas pilas
        staticStack.push(value);
        dynamicStack.push(newNode);
        
        // Actualizar las pilas
        updateStacks();
        
        // Limpiar el TextField después de agregar el valor
        txtStackValue.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un valor numérico válido.");
    }
    }//GEN-LAST:event_btnPushActionPerformed
    private void updateStacks() {
    // Limpiar las listas antes de actualizar
    lstDynamicStack.clear();
    lstStaticStack.clear();

    // Actualizar la pila dinámica
    Node currentNode = dynamicStack.peek();
    while (currentNode != null) {
        lstDynamicStack.add(currentNode.getValue());
        currentNode = currentNode.getNext();
    }

    // Actualizar la pila estática
    StaticStack temporal = new StaticStack();
    String elemento;

    // Mostrar los elementos en la pila estática
    while (!staticStack.isEmpty()) {
        elemento = String.valueOf(staticStack.pop());
        lstStaticStack.add(elemento);
        temporal.push(Integer.parseInt(elemento));
    }

    // Restaurar los elementos en la pila original
    while (!temporal.isEmpty()) {
        staticStack.push(Integer.parseInt(String.valueOf(temporal.pop())));
    }
}
    
    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
         if (!dynamicStack.isEmpty()) {
        Node poppedNode = dynamicStack.pop();
        JOptionPane.showMessageDialog(this, "Element removed from the dynamic stack: " + poppedNode.getValue() +
                "\nElement removed from the static stack: " + staticStack.pop());
        updateStacks();
        return;
    }

    if (dynamicStack.isEmpty() && staticStack.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Both stacks are empty");
    }
    
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        // TODO add your handling code here:
         Node topNode = dynamicStack.peek();
    if (!dynamicStack.isEmpty() || !staticStack.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Element on the top of the dynamic stack is: " + topNode.getValue() +
                "\nElement on the top of the static stack is: " + staticStack.peek());
        return;
    }
    JOptionPane.showMessageDialog(this, "Both stacks are empty");
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Current static stack size is: " + staticStack.size() +
            "\nCurrent dynamic stack size is: " + dynamicStack.size());
    }//GEN-LAST:event_btnSizeActionPerformed

    private void btnEnqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnqueueActionPerformed
        // TODO add your handling code here:
         try {
        int value = Integer.parseInt(txtValueSimpleQueue.getText());
        
        // Agregar valor a la cola estática
        if (!staticQueue.isFull()) {
            staticQueue.enqueue(value);
            updateQueueDisplay(staticQueue, lstStaticQueue);
        } else {
            JOptionPane.showMessageDialog(this, "Static queue is full.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

        // Agregar valor a la cola dinámica
        dynamicQueue.enqueue(value);
        updateQueueDisplay(dynamicQueue, lstDynamicQueue);

        // Agregar valor a la cola circular
        if (!circularQueue.isFull()) {
            circularQueue.enqueue(value);
            updateQueueDisplay(circularQueue, lstCircularQueue); // Actualiza la visualización de la cola circular
        } else {
            JOptionPane.showMessageDialog(this, "Circular queue is full.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    txtValueSimpleQueue.setText(""); // Limpiar el TextField después de insertar
    txtValueSimpleQueue.requestFocus(); // Colocar el cursor nuevamente en el TextField
    }//GEN-LAST:event_btnEnqueueActionPerformed

    private void btnDequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDequeueActionPerformed
        // TODO add your handling code here:
         try {
        StringBuilder message = new StringBuilder();

        // Eliminar un valor de la cola estática
        if (!staticQueue.isEmpty()) {
            int dequeuedValueStatic = staticQueue.dequeue();
            updateQueueDisplay(staticQueue, lstStaticQueue);
            message.append("Static Queue: ").append(dequeuedValueStatic).append("\n");
        } else {
            message.append("Static Queue: Empty\n");
        }

        // Eliminar un valor de la cola dinámica
        if (!dynamicQueue.isEmpty()) {
            int dequeuedValueDynamic = dynamicQueue.dequeue();
            updateQueueDisplay(dynamicQueue, lstDynamicQueue);
            message.append("Dynamic Queue: ").append(dequeuedValueDynamic).append("\n");
        } else {
            message.append("Dynamic Queue: Empty\n");
        }

        // Eliminar un valor de la cola circular
        if (!circularQueue.isEmpty()) {
            int dequeuedValueCircular = circularQueue.dequeue();
            updateQueueDisplay(circularQueue, lstCircularQueue);
            message.append("Circular Queue: ").append(dequeuedValueCircular).append("\n");
        } else {
            message.append("Circular Queue: Empty\n");
        }

        // Mostrar todos los resultados en un solo JOptionPane
        JOptionPane.showMessageDialog(this, message.toString(), "Dequeued Values", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
         
    }//GEN-LAST:event_btnDequeueActionPerformed

    private void btnPeekQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekQueueActionPerformed
        // TODO add your handling code here:
         try {
        StringBuilder message = new StringBuilder();

        // Ver el valor al frente de la cola estática sin eliminarlo
        if (!staticQueue.isEmpty()) {
            int frontValueStatic = staticQueue.peek();
            message.append("Static Queue: ").append(frontValueStatic).append("\n");
        } else {
            message.append("Static Queue: Empty\n");
        }

        // Ver el valor al frente de la cola dinámica sin eliminarlo
        if (!dynamicQueue.isEmpty()) {
            int frontValueDynamic = dynamicQueue.peek();
            message.append("Dynamic Queue: ").append(frontValueDynamic).append("\n");
        } else {
            message.append("Dynamic Queue: Empty\n");
        }

        // Ver el valor al frente de la cola circular sin eliminarlo
        if (!circularQueue.isEmpty()) {
            int frontValueCircular = circularQueue.peek();
            message.append("Circular Queue: ").append(frontValueCircular).append("\n");
        } else {
            message.append("Circular Queue: Empty\n");
        }

        // Mostrar todos los resultados en un solo JOptionPane
        JOptionPane.showMessageDialog(this, message.toString(), "Peek Values", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnPeekQueueActionPerformed

    private void btnSizeQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeQueueActionPerformed
        // TODO add your handling code here:
         try {
        StringBuilder message = new StringBuilder();

        // Obtener el tamaño de la cola estática
        int staticQueueSize = staticQueue.size();
        message.append("Static Queue Size: ").append(staticQueueSize).append("\n");

        // Obtener el tamaño de la cola dinámica
        int dynamicQueueSize = dynamicQueue.size();
        message.append("Dynamic Queue Size: ").append(dynamicQueueSize).append("\n");

        // Obtener el tamaño de la cola circular
        int circularQueueSize = circularQueue.size();
        message.append("Circular Queue Size: ").append(circularQueueSize).append("\n");

        // Mostrar todos los tamaños en un solo JOptionPane
        JOptionPane.showMessageDialog(this, message.toString(), "Queue Sizes", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
         
    }//GEN-LAST:event_btnSizeQueueActionPerformed

    private void btnInsertFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertFrontActionPerformed
        // TODO add your handling code here:
        try {
        String inputValue = txtQueueDoubleValue.getText();
        if (isInteger(inputValue)) {
            int value = Integer.parseInt(inputValue);

            // Insertar al frente de la cola estática
            if (!doubleEndedStaticQueue.isFull()) {
                doubleEndedStaticQueue.insertFront(value); // Insertar al frente de la cola estática

                // Limpiar y actualizar el ListBox para la cola estática
                lstQueueDobleVector.clear();
                for (Integer item : doubleEndedStaticQueue.getQueueElements()) { // Obtener elementos de la cola estática
                    lstQueueDobleVector.add(item);  // Agregar cada elemento al ListBox de la cola estática
                }
            } else {
                // Manejar el error si la cola estática está llena
                JOptionPane.showMessageDialog(this, "Static double queue is full", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

            // Insertar al frente de la cola dinámica (sin depender de la cola estática)
            try {
                doubleEndedDynamicQueue.insertFront(value); // Inserta el valor al frente de la cola dinámica

                // Limpiar y actualizar el ListBox para la cola dinámica
                lstQueueDoubleList.clear();
                for (Integer item : doubleEndedDynamicQueue.getQueueElements()) {
                    lstQueueDoubleList.add(item);  // Agregar cada elemento al ListBox de la cola dinámica
                }
            } catch (IllegalStateException ex) {
                // Manejar el error si la cola dinámica está llena
                JOptionPane.showMessageDialog(this, "Dynamic queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Limpiar el TextField y dar foco de nuevo
        txtQueueDoubleValue.setText("");
        txtQueueDoubleValue.requestFocus();
    } catch (Exception ex) {
        // Manejo de excepciones genéricas
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean isInteger(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
    }//GEN-LAST:event_btnInsertFrontActionPerformed

    private void btnInsertRearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertRearActionPerformed
        // TODO add your handling code here:
        try {
        // Validar si la entrada es un número
        String inputValue = txtQueueDoubleValue.getText();
        if (isInteger(inputValue)) {
            int value = Integer.parseInt(inputValue);

            // Insertar en la cola estática
            if (!doubleEndedStaticQueue.isFull()) {
                doubleEndedStaticQueue.insertRear(value); // Insertar al final de la cola estática

                // Limpiar y actualizar el ListBox para la cola estática
                lstQueueDobleVector.clear();
                for (Integer item : doubleEndedStaticQueue.getQueueElements()) { // Obtener elementos de la cola estática
                    lstQueueDobleVector.add(item);  // Agregar cada elemento al ListBox de la cola estática
                }
            } else {
                // Manejar el error si la cola estática está llena
                JOptionPane.showMessageDialog(this, "Static double queue is full", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

            // Insertar en la cola dinámica
            try {
                doubleEndedDynamicQueue.insertRear(value); // Insertar al final de la cola dinámica

                // Limpiar y actualizar el ListBox para la cola dinámica
                lstQueueDoubleList.clear();
                for (Integer item : doubleEndedDynamicQueue.getQueueElements()) { // Obtener elementos de la cola dinámica
                    lstQueueDoubleList.add(item);  // Agregar cada elemento al ListBox de la cola dinámica
                }
            } catch (IllegalStateException ex) {
                // Manejar el error si la cola dinámica está llena
                JOptionPane.showMessageDialog(this, "Dynamic queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            // Si la entrada no es un número, mostrar mensaje de error
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Limpiar el TextField y dar foco de nuevo
        txtQueueDoubleValue.setText("");
        txtQueueDoubleValue.requestFocus();
    } catch (Exception ex) {
        // Manejo de excepciones genéricas
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private boolean isInteger(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
    
    }//GEN-LAST:event_btnInsertRearActionPerformed

    private void btnDeleteFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFrontActionPerformed
        // TODO add your handling code here:
        try {
        // Intentar eliminar el elemento desde el frente de la cola estática
        try {
            if (!doubleEndedStaticQueue.isEmpty()) { // Verificar si la cola estática no está vacía
                doubleEndedStaticQueue.deleteFront(); // Eliminar desde el frente de la cola estática

                // Limpiar y actualizar el ListBox para la cola estática
                lstQueueDobleVector.clear();
                for (Integer item : doubleEndedStaticQueue.getQueueElements()) { // Obtener elementos de la cola estática
                    lstQueueDobleVector.add(item);  // Agregar cada elemento al ListBox de la cola estática
                }
            } else {
                JOptionPane.showMessageDialog(this, "Static queue is empty, cannot delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            // Manejar cualquier error de la cola estática
            JOptionPane.showMessageDialog(this, "Static queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Intentar eliminar el elemento desde el frente de la cola dinámica
        try {
            if (!doubleEndedDynamicQueue.isEmpty()) { // Verificar si la cola dinámica no está vacía
                doubleEndedDynamicQueue.deleteFront(); // Eliminar desde el frente de la cola dinámica

                // Limpiar y actualizar el ListBox para la cola dinámica
                lstQueueDoubleList.clear();
                for (Integer item : doubleEndedDynamicQueue.getQueueElements()) { // Obtener elementos de la cola dinámica
                    lstQueueDoubleList.add(item);  // Agregar cada elemento al ListBox de la cola dinámica
                }
            } else {
                JOptionPane.showMessageDialog(this, "Dynamic queue is empty, cannot delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            // Manejar cualquier error de la cola dinámica
            JOptionPane.showMessageDialog(this, "Dynamic queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception ex) {
        // Manejo de excepciones genéricas
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnDeleteFrontActionPerformed

    private void btnDeleteRearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRearActionPerformed
        // TODO add your handling code here:
         try {
        // Intentar eliminar el elemento desde el final de la cola estática
        try {
            if (!doubleEndedStaticQueue.isEmpty()) { // Verificar si la cola estática no está vacía
                doubleEndedStaticQueue.deleteRear(); // Eliminar desde el final de la cola estática

                // Limpiar y actualizar el ListBox para la cola estática
                lstQueueDobleVector.clear();
                for (Integer item : doubleEndedStaticQueue.getQueueElements()) { // Obtener elementos de la cola estática
                    lstQueueDobleVector.add(item);  // Agregar cada elemento al ListBox de la cola estática
                }
            } else {
                JOptionPane.showMessageDialog(this, "Static queue is empty, cannot delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            // Manejar cualquier error de la cola estática
            JOptionPane.showMessageDialog(this, "Static queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Intentar eliminar el elemento desde el final de la cola dinámica
        try {
            if (!doubleEndedDynamicQueue.isEmpty()) { // Verificar si la cola dinámica no está vacía
                doubleEndedDynamicQueue.deleteRear(); // Eliminar desde el final de la cola dinámica

                // Limpiar y actualizar el ListBox para la cola dinámica
                lstQueueDoubleList.clear();
                for (Integer item : doubleEndedDynamicQueue.getQueueElements()) { // Obtener elementos de la cola dinámica
                    lstQueueDoubleList.add(item);  // Agregar cada elemento al ListBox de la cola dinámica
                }
            } else {
                JOptionPane.showMessageDialog(this, "Dynamic queue is empty, cannot delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Dynamic queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
         
    }//GEN-LAST:event_btnDeleteRearActionPerformed

    private void btnGetFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetFrontActionPerformed
        // TODO add your handling code here:
        try {
        // Obtener el primer elemento de la cola estática
        try {
            if (!doubleEndedStaticQueue.isEmpty()) { // Verificar si la cola estática no está vacía
                int frontStatic = doubleEndedStaticQueue.getFront(); // Obtener el primer elemento de la cola estática
                JOptionPane.showMessageDialog(this, "Front of static queue: " + frontStatic, "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Static queue is empty, cannot get front.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            // Manejar cualquier error de la cola estática
            JOptionPane.showMessageDialog(this, "Static queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Obtener el primer elemento de la cola dinámica
        try {
            if (!doubleEndedDynamicQueue.isEmpty()) { // Verificar si la cola dinámica no está vacía
                int frontDynamic = doubleEndedDynamicQueue.getFront(); // Obtener el primer elemento de la cola dinámica
                JOptionPane.showMessageDialog(this, "Front of dynamic queue: " + frontDynamic, "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Dynamic queue is empty, cannot get front.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            // Manejar cualquier error de la cola dinámica
            JOptionPane.showMessageDialog(this, "Dynamic queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception ex) {
        // Manejo de excepciones genéricas
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGetFrontActionPerformed

    private void btnGetRearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetRearActionPerformed
        // TODO add your handling code here:
        try {
        // Obtener el último elemento de la cola estática
        try {
            if (!doubleEndedStaticQueue.isEmpty()) { // Verificar si la cola estática no está vacía
                int rearStatic = doubleEndedStaticQueue.getRear(); // Obtener el último elemento de la cola estática
                JOptionPane.showMessageDialog(this, "Rear of static queue: " + rearStatic, "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Static queue is empty, cannot get rear.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            // Manejar cualquier error de la cola estática
            JOptionPane.showMessageDialog(this, "Static queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Obtener el último elemento de la cola dinámica
        try {
            if (!doubleEndedDynamicQueue.isEmpty()) { // Verificar si la cola dinámica no está vacía
                int rearDynamic = doubleEndedDynamicQueue.getRear(); // Obtener el último elemento de la cola dinámica
                JOptionPane.showMessageDialog(this, "Rear of dynamic queue: " + rearDynamic, "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Dynamic queue is empty, cannot get rear.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            // Manejar cualquier error de la cola dinámica
            JOptionPane.showMessageDialog(this, "Dynamic queue error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception ex) {
        // Manejo de excepciones genéricas
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnGetRearActionPerformed

    private void btnSizeDoubleQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeDoubleQueueActionPerformed
        // TODO add your handling code here:
{
    try
    {
        // Obtener el tamaño de la cola estática
        int staticQueueSize = doubleEndedStaticQueue.Size(); // Obtener el tamaño de la cola estática
        MessageBox.Show($"Size of static queue: {staticQueueSize}", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information);

        // Obtener el tamaño de la cola dinámica
        int dynamicQueueSize = doubleEndedDynamicQueue.Size(); // Obtener el tamaño de la cola dinámica
        MessageBox.Show($"Size of dynamic queue: {dynamicQueueSize}", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information);
    }
    catch (Exception ex)
    {
        // Capturar y mostrar errores
        MessageBox.Show($"Error: {ex.Message}", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
    }
}

    }//GEN-LAST:event_btnSizeDoubleQueueActionPerformed
private void updateListBoxes() {
    // Limpiar los componentes visuales (por ejemplo, modelos de JList)
    listModelPriorityQueueVV.clear();
    listModelPriorityQueueVL.clear();
    listModelPriorityQueueLL.clear();
    listModelPriorityQueueLV.clear();

    // Actualizar los componentes con las estructuras de datos
    updateListBox(listModelPriorityQueueVV, vectorOfVectorsPQ);
    updateListBox(listModelPriorityQueueVL, vectorOfListsPQ);
    updateListBox(listModelPriorityQueueLL, listOfListsPQ);
    updateListBox(listModelPriorityQueueLV, listOfVectorsPQ);
}
private <T> void updateListBox(DefaultListModel<String> listModel, T queue) {
    // Limpiar el modelo del JList
    listModel.clear();

    // Convertir la cola a una lista de elementos (usando un método genérico o específico)
    List<?> items = toList(queue);

    // Agregar los elementos al modelo del JList
    for (Object item : items) {
        listModel.addElement(item.toString());
    }
}

    private void btnEnqueuePriorityQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnqueuePriorityQueueActionPerformed
        // TODO add your handling code here:
         try {
        // Intentar convertir los valores de texto a enteros
        int value = Integer.parseInt(txtQueuePriorityValue.getText());
        int priority = Integer.parseInt(txtPriorityQueueLevel.getText());

        // Encolar los valores en las diferentes estructuras de datos
        vectorOfVectorsPQ.enqueue(value, priority);
        vectorOfListsPQ.enqueue(value, priority);
        listOfListsPQ.enqueue(value, priority);
        listOfVectorsPQ.enqueue(value, priority);

        // Actualizar los componentes visuales
        updateListBoxes();
    } catch (NumberFormatException e) {
        // Mostrar mensaje si los valores ingresados no son válidos
        JOptionPane.showMessageDialog(this, "Please enter a valid integer value.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEnqueuePriorityQueueActionPerformed

    private void btnDequeuePriorityQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDequeuePriorityQueueActionPerformed
        // TODO add your handling code here:
         try {
        // Verificar y realizar dequeue en vectorOfVectorsPQ
        if (!vectorOfVectorsPQ.isEmpty()) {
            Integer dequeuedItem = vectorOfVectorsPQ.dequeue();
            JOptionPane.showMessageDialog(this, "Dequeued from vectorOfVectorsPQ: " + dequeuedItem);
        } else {
            JOptionPane.showMessageDialog(this, "vectorOfVectorsPQ is empty.");
        }

        // Verificar y realizar dequeue en vectorOfListsPQ
        if (!vectorOfListsPQ.isEmpty()) {
            Integer dequeuedItem = vectorOfListsPQ.dequeue();
            JOptionPane.showMessageDialog(this, "Dequeued from vectorOfListsPQ: " + dequeuedItem);
        } else {
            JOptionPane.showMessageDialog(this, "vectorOfListsPQ is empty.");
        }

        // Verificar y realizar dequeue en listOfListsPQ
        if (!listOfListsPQ.isEmpty()) {
            Integer dequeuedItem = listOfListsPQ.dequeue();
            JOptionPane.showMessageDialog(this, "Dequeued from listOfListsPQ: " + dequeuedItem);
        } else {
            JOptionPane.showMessageDialog(this, "listOfListsPQ is empty.");
        }

        // Verificar y realizar dequeue en listOfVectorsPQ
        if (!listOfVectorsPQ.isEmpty()) {
            Integer dequeuedItem = listOfVectorsPQ.dequeue();
            JOptionPane.showMessageDialog(this, "Dequeued from listOfVectorsPQ: " + dequeuedItem);
        } else {
            JOptionPane.showMessageDialog(this, "listOfVectorsPQ is empty.");
        }

        // Actualizar los JList después de realizar el dequeue
        updateListBoxes();

    } catch (Exception ex) {
        // Si ocurre algún error, mostrar mensaje al usuario
        JOptionPane.showMessageDialog(this, "An error occurred while dequeuing: " + ex.getMessage(), 
                                      "Error", JOptionPane.ERROR_MESSAGE);
    }
         
    }//GEN-LAST:event_btnDequeuePriorityQueueActionPerformed

    private void btnPeekPriorityQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekPriorityQueueActionPerformed
        // TODO add your handling code here:
         try {
        // Verificar si vectorOfVectorsPQ no está vacío y obtener el próximo elemento
        if (!vectorOfVectorsPQ.isEmpty()) {
            Integer peekedItem = vectorOfVectorsPQ.peek();
            JOptionPane.showMessageDialog(this, "Next item in vectorOfVectorsPQ: " + peekedItem);
        } else {
            JOptionPane.showMessageDialog(this, "vectorOfVectorsPQ is empty.");
        }

        // Verificar si vectorOfListsPQ no está vacío y obtener el próximo elemento
        if (!vectorOfListsPQ.isEmpty()) {
            Integer peekedItem = vectorOfListsPQ.peek();
            JOptionPane.showMessageDialog(this, "Next item in vectorOfListsPQ: " + peekedItem);
        } else {
            JOptionPane.showMessageDialog(this, "vectorOfListsPQ is empty.");
        }

        // Verificar si listOfListsPQ no está vacío y obtener el próximo elemento
        if (!listOfListsPQ.isEmpty()) {
            Integer peekedItem = listOfListsPQ.peek();
            JOptionPane.showMessageDialog(this, "Next item in listOfListsPQ: " + peekedItem);
        } else {
            JOptionPane.showMessageDialog(this, "listOfListsPQ is empty.");
        }

        // Verificar si listOfVectorsPQ no está vacío y obtener el próximo elemento
        if (!listOfVectorsPQ.isEmpty()) {
            Integer peekedItem = listOfVectorsPQ.peek();
            JOptionPane.showMessageDialog(this, "Next item in listOfVectorsPQ: " + peekedItem);
        } else {
            JOptionPane.showMessageDialog(this, "listOfVectorsPQ is empty.");
        }
    } catch (Exception ex) {
        // Si ocurre algún error inesperado, mostrar un mensaje al usuario
        JOptionPane.showMessageDialog(this, "An error occurred while peeking: " + ex.getMessage(),
                                      "Error", JOptionPane.ERROR_MESSAGE);
    }
         
    }//GEN-LAST:event_btnPeekPriorityQueueActionPerformed

    private void btnAddNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNodeActionPerformed
        // TODO add your handling code here:
          String nodeName = txtNode.getText().trim();
    if (!nodeName.isEmpty()) {
        // Verificar si el nodo ya existe en el grafo
        if (graph.getNodes().stream().anyMatch(node -> node.getName().equals(nodeName))) {
            JOptionPane.showMessageDialog(this, 
                                          "The node '" + nodeName + "' already exists.", 
                                          "Error", 
                                          JOptionPane.ERROR_MESSAGE);
        } else {
            // Si no existe, añadir el nodo
            GraphNode newNode = new GraphNode(nodeName);
            graph.addNode(newNode);
            JOptionPane.showMessageDialog(this, 
                                          "Node '" + nodeName + "' added.", 
                                          "Success", 
                                          JOptionPane.INFORMATION_MESSAGE);

            txtNode.setText(""); // Limpiar el campo de texto
            
            String weightText = txtWeight.getText().trim();
            if (!weightText.isEmpty()) {
                try {
                    int weight = Integer.parseInt(weightText);
                    txtGraphRepresentation.setText(graph.showAdjacencyListWithWeights());
                } catch (NumberFormatException e) {
                    // Si el peso no es válido, mostrar lista de adyacencia sin pesos
                    txtGraphRepresentation.setText(graph.showAdjacencyList());
                }
            } else {
                txtGraphRepresentation.setText(graph.showAdjacencyList());
            }

            txtFrom.setText(""); // Limpiar el campo "Desde"
            txtTo.setText("");   // Limpiar el campo "Hacia"
        }
    }
    
    }//GEN-LAST:event_btnAddNodeActionPerformed

    private void btnAddEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEdgeActionPerformed
        // TODO add your handling code here:
         String fromNodeName = txtFrom.getText().trim();
    String toNodeName = txtTo.getText().trim();
    String weightText = txtWeight.getText().trim(); // Campo de texto para el peso

    GraphNode fromNode = graph.getNodes().stream()
                              .filter(n -> n.getName().equals(fromNodeName))
                              .findFirst()
                              .orElse(null);

    GraphNode toNode = graph.getNodes().stream()
                            .filter(n -> n.getName().equals(toNodeName))
                            .findFirst()
                            .orElse(null);

    if (fromNode != null && toNode != null) {
        // Si el campo de peso no está vacío, se usa el constructor con peso
        if (!weightText.isEmpty()) {
            try {
                int weight = Integer.parseInt(weightText);
                if (chkDirected.isSelected()) {
                    graph.addEdge(fromNode, toNode, weight);
                    JOptionPane.showMessageDialog(this, 
                                                  "Edge added from '" + fromNodeName + 
                                                  "' to '" + toNodeName + 
                                                  "' with weight " + weight + ".");
                } else {
                    graph.addNoDirectedEdge(fromNode, toNode, weight);
                    JOptionPane.showMessageDialog(this, 
                                                  "Edge added from '" + fromNodeName + 
                                                  "' to '" + toNodeName + 
                                                  "' with weight " + weight + ".");
                }
                txtGraphRepresentation.setText(graph.showAdjacencyListWithWeights());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, 
                                              "Invalid weight value. Please enter a numeric weight.", 
                                              "Error", 
                                              JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Si no se especifica peso, se usa el constructor sin peso
            if (chkDirected.isSelected()) {
                graph.addEdge(fromNode, toNode);
                JOptionPane.showMessageDialog(this, 
                                              "Edge added from '" + fromNodeName + 
                                              "' to '" + toNodeName + "'.");
            } else {
                graph.addNoDirectedEdge(fromNode, toNode);
                JOptionPane.showMessageDialog(this, 
                                              "Edge added from '" + fromNodeName + 
                                              "' to '" + toNodeName + "'.");
            }
            txtGraphRepresentation.setText(graph.showAdjacencyList());
        }
        txtFrom.setText(""); // Limpiar los campos de texto
        txtTo.setText("");
    } else {
        JOptionPane.showMessageDialog(this, 
                                      "One or both nodes do not exist.", 
                                      "Error", 
                                      JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_btnAddEdgeActionPerformed

    private void btnRemoveNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveNodeActionPerformed
        // TODO add your handling code here:
          String nodeName = txtNode.getText().trim();
    GraphNode nodeToRemove = graph.getNodes().stream()
                                  .filter(n -> n.getName().equals(nodeName))
                                  .findFirst()
                                  .orElse(null);

    if (nodeToRemove != null) {
        graph.removeNode(nodeToRemove);
        JOptionPane.showMessageDialog(this, 
                                      "Node '" + nodeName + "' deleted.", 
                                      "Success", 
                                      JOptionPane.INFORMATION_MESSAGE);
        txtNode.setText("");

        // Actualizar la representación de la lista de adyacencia
        String weightText = txtWeight.getText().trim();
        if (!weightText.isEmpty()) {
            try {
                int weight = Integer.parseInt(weightText);
                txtGraphRepresentation.setText(graph.showAdjacencyListWithWeights());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, 
                                              "Invalid weight value. Showing adjacency list without weights.", 
                                              "Warning", 
                                              JOptionPane.WARNING_MESSAGE);
                txtGraphRepresentation.setText(graph.showAdjacencyList());
            }
        } else {
            txtGraphRepresentation.setText(graph.showAdjacencyList());
        }
        txtFrom.setText(""); // Limpiar los campos de texto
        txtTo.setText("");
    } else {
        JOptionPane.showMessageDialog(this, 
                                      "Node not found.", 
                                      "Error", 
                                      JOptionPane.WARNING_MESSAGE);
    }
    
    }//GEN-LAST:event_btnRemoveNodeActionPerformed

    private void btnRemoveEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEdgeActionPerformed
        // TODO add your handling code here:
         String fromNodeName = txtFrom.getText().trim();
    String toNodeName = txtTo.getText().trim();
    boolean isDirected = chkDirected.isSelected(); // CheckBox para determinar si la arista es dirigida.

    GraphNode fromNode = graph.getNodes().stream()
                              .filter(n -> n.getName().equals(fromNodeName))
                              .findFirst()
                              .orElse(null);

    GraphNode toNode = graph.getNodes().stream()
                            .filter(n -> n.getName().equals(toNodeName))
                            .findFirst()
                            .orElse(null);

    if (fromNode != null && toNode != null) {
        if (isDirected) {
            graph.removeEdge(fromNode, toNode);
            JOptionPane.showMessageDialog(this, 
                                          "Directed edge removed from '" + fromNodeName + "' to '" + toNodeName + "'.", 
                                          "Success", 
                                          JOptionPane.INFORMATION_MESSAGE);
        } else {
            graph.removeEdge(fromNode, toNode);
            graph.removeEdge(toNode, fromNode);
            JOptionPane.showMessageDialog(this, 
                                          "Undirected edge removed between '" + fromNodeName + "' and '" + toNodeName + "'.", 
                                          "Success", 
                                          JOptionPane.INFORMATION_MESSAGE);
        }

        String weightText = txtWeight.getText().trim();
        if (!weightText.isEmpty()) {
            try {
                int weight = Integer.parseInt(weightText);
                txtGraphRepresentation.setText(graph.showAdjacencyListWithWeights());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, 
                                              "Invalid weight value. Showing adjacency list without weights.", 
                                              "Warning", 
                                              JOptionPane.WARNING_MESSAGE);
                txtGraphRepresentation.setText(graph.showAdjacencyList());
            }
        } else {
            txtGraphRepresentation.setText(graph.showAdjacencyList());
        }

        txtFrom.setText(""); // Limpiar los campos de texto
        txtTo.setText("");
    } else {
        JOptionPane.showMessageDialog(this, 
                                      "One or both nodes do not exist.", 
                                      "Error", 
                                      JOptionPane.WARNING_MESSAGE);
    }
    
    }//GEN-LAST:event_btnRemoveEdgeActionPerformed

    private void btnShowDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDFSActionPerformed
        // TODO add your handling code here:
         txtGraphRepresentation.setText(""); // Limpiar el campo de texto

    // Obtener el nombre del nodo de inicio desde el campo de texto
    String startNodeName = txtStartNode.getText();

    // Buscar el nodo en el grafo cuyo nombre coincida con el ingresado
    GraphNode startNode = null;
    for (GraphNode node : graph.getNodes()) {
        if (node.getName().equals(startNodeName)) {
            startNode = node;
            break;
        }
    }

    if (startNode != null) {
        // Realizar DFS desde el nodo encontrado
        String result = graph.DFSIterative(startNode);
        txtGraphRepresentation.setText(result); // Mostrar el resultado en el campo de texto
    } else {
        // Si el nodo no existe, mostrar un mensaje de error
        txtGraphRepresentation.setText("Node not found.");
    }
    
    }//GEN-LAST:event_btnShowDFSActionPerformed

    private void btnShowBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowBFSActionPerformed
        // TODO add your handling code here:
        txtGraphRepresentation.setText(""); // Limpiar el campo de texto

    // Obtener el nombre del nodo de inicio desde el campo de texto
    String startNodeName = txtStartNode.getText();

    // Buscar el nodo en el grafo cuyo nombre coincida con el ingresado
    GraphNode startNode = null;
    for (GraphNode node : graph.getNodes()) {
        if (node.getName().equals(startNodeName)) {
            startNode = node;
            break;
        }
    }

    if (startNode != null) {
        // Realizar BFS desde el nodo encontrado
        String result = graph.BFS(startNode);
        txtGraphRepresentation.setText(result); // Mostrar el resultado en el campo de texto
    } else {
        // Si el nodo no existe, mostrar un mensaje de error
        txtGraphRepresentation.setText("Node not found.");
    }
    
    }//GEN-LAST:event_btnShowBFSActionPerformed

    private void btnShowDFSRecursiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDFSRecursiveActionPerformed
        // TODO add your handling code here:
         txtGraphRepresentation.setText(""); // Limpiar el campo de texto

    // Obtener el nombre del nodo de inicio desde el campo de texto
    String startNodeName = txtStartNode.getText();

    // Buscar el nodo en el grafo cuyo nombre coincida con el ingresado
    GraphNode startNode = null;
    for (GraphNode node : graph.getNodes()) {
        if (node.getName().equals(startNodeName)) {
            startNode = node;
            break;
        }
    }

    if (startNode != null) {
        // Realizar DFS recursivo desde el nodo encontrado
        String result = graph.DFSRecursive(startNode); // Llamada al DFS recursivo
        txtGraphRepresentation.setText(result); // Mostrar el resultado en el campo de texto
    } else {
        // Si el nodo no existe, mostrar un mensaje de error
        txtGraphRepresentation.setText("Node not found.");
    }
    
    }//GEN-LAST:event_btnShowDFSRecursiveActionPerformed

    private void btnRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAllActionPerformed
        // TODO add your handling code here:
         // Show a confirmation dialog in English
    int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove all nodes and edges?", 
                                                "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
    if (result == JOptionPane.YES_OPTION) {
        // Remove all nodes and edges
        graph.removeGraph();
        
        // Show success message
        JOptionPane.showMessageDialog(null, "All nodes and edges removed.", 
                                      "Success", JOptionPane.INFORMATION_MESSAGE);
        
        // Clear the graph representation text field
        txtGraphRepresentation.setText("");
    }
    
    }//GEN-LAST:event_btnRemoveAllActionPerformed

    private void btnSetNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetNumbersActionPerformed
        // TODO add your handling code here:
         Random random = new Random();
    
    // Create an array of random numbers between 1 and 100 (exclusive)
    int[] numbers = new int[8];
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = random.nextInt(99) + 1; // Generate random numbers from 1 to 99
    }
    
    // Display the numbers (you need to implement this method to display the numbers in your desired format)
    displayNumbers(numbers);
}

private void displayNumbers(int[] numbers) {
    // You can display the numbers in a JTextArea, JLabel, or other UI components
    StringBuilder sb = new StringBuilder();
    for (int num : numbers) {
        sb.append(num).append(" ");
    }
    // For example, display in a JTextArea (make sure you have a JTextArea named txtNumbers)
    txtNumbers.setText(sb.toString());
    }//GEN-LAST:event_btnSetNumbersActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
         if (numbers == null || numbers.length == 0) {
        JOptionPane.showMessageDialog(null, "Please generate numbers first.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String selectedMethod = (String) cmbAlgorithms.getSelectedItem();
    long startTime = System.currentTimeMillis();

    switch (selectedMethod) {
        case "Gnome Sort":
            GnomeSort.sort(numbers, this::displayNumbers);
            break;
        case "Bubble Sort":
            BubbleSort.sort(numbers, this::displayNumbers);
            break;
        case "Comb Sort":
            CombSort.sort(numbers, this::displayNumbers);
            break;
        case "Pigeonhole Sort":
            PigeonHoleSort.sort(numbers, this::displayNumbersPigeonhole);
            break;
        case "Cocktail Sort":
            CocktailSort.sort(numbers, this::displayNumbers);
            break;
        case "Heap Sort":
            HeapSort.sort(numbers, this::displayNumbers);
            break;
        case "Insertion Sort":
            InsertionSort.sort(numbers, this::displayNumbers);
            break;
        case "Shell Sort":
            ShellSort.sort(numbers, this::displayNumbers);
            break;
        case "Radix MSD Sort":
            RadixMSDSort.sort(numbers, this::displayNumbersRadix, this::showMessage);
            lblStatus.setText("");
            break;
        case "Radix LSD Sort":
            RadixLSDSort.sort(numbers, this::displayNumbersRadix, this::showMessage);
            break;
        case "Selection Sort":
            SelectionSort.sort(numbers, this::displayNumbers);
            break;
        case "Counting Sort":
            CountingSort.sort(numbers, this::displayNumbersMerge);
            break;
        case "Bucket Sort":
            BucketSort.sort(numbers, this::displayNumbersMerge);
            break;
        case "Merge Sort":
            MergeAlgorithms.mergeSort(numbers, 0, numbers.length - 1, this::displayNumbersMerge);
            break;
        case "Natural Merge":
            MergeAlgorithms.naturalMerge(numbers, this::displayNumbersMerge);
            break;
        case "Direct Merge":
            MergeAlgorithms.directMerge(numbers, this::displayNumbersMerge);
            break;
        case "Quick Sort":
            QuickSort.sort(numbers, 0, numbers.length - 1, this::displayNumbers);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Invalid sorting method.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
    }

    long endTime = System.currentTimeMillis();
    long elapsedTime = endTime - startTime;
    JOptionPane.showMessageDialog(null, String.format("Sorting Completed!\n\nMethod: %s\nTime: %.2f ms", selectedMethod, elapsedTime / 1000.0),
            "Result", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnPriorityQueueSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriorityQueueSizeActionPerformed
        // TODO add your handling code here:
          try {
        // Show the size of each queue
        JOptionPane.showMessageDialog(null, "vectorOfVectorsPQ size: " + vectorOfVectorsPQ.size());
        JOptionPane.showMessageDialog(null, "vectorOfListsPQ size: " + vectorOfListsPQ.size());
        JOptionPane.showMessageDialog(null, "listOfListsPQ size: " + listOfListsPQ.size());
        JOptionPane.showMessageDialog(null, "listOfVectorsPQ size: " + listOfVectorsPQ.size());
    } catch (Exception ex) {
        // Handle any unexpected errors
        JOptionPane.showMessageDialog(null, "An error occurred while retrieving the sizes: " + ex.getMessage());
    }
          
    }//GEN-LAST:event_btnPriorityQueueSizeActionPerformed

    private void btnInsertNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertNodeActionPerformed
        // TODO add your handling code here:
          try {
        int value = Integer.parseInt(txtNodeValue.getText());
        root.insert(value);
        drawTree();
        txtNodeValue.setText("");  // Clear the input field
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid integer.");
    }
    }//GEN-LAST:event_btnInsertNodeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
        int value = Integer.parseInt(txtNodeValue.getText());
        root = root.delete(root, value); // Delete the node
        drawTree();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid integer.");
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         try {
        int value = Integer.parseInt(txtNodeValue.getText());
        BinaryTree.Node foundNode = root.search(value);
        JOptionPane.showMessageDialog(this, root.getNodeInfo(foundNode, "Found"));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter a valid integer.");
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPreOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrderActionPerformed
        // TODO add your handling code here:
         String result = preOrderTraversal(root);
    txtOutput.setText(result);
    }//GEN-LAST:event_btnPreOrderActionPerformed

    private String preOrderTraversal(BinaryTree.Node node) {
    if (node == null) return "";
    return node.value + ", " + preOrderTraversal(node.left) + preOrderTraversal(node.right);
    }
    
    private void btnPostOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrderActionPerformed
        // TODO add your handling code here:
         String result = postOrderTraversal(root);
    txtOutput.setText(result);
    }//GEN-LAST:event_btnPostOrderActionPerformed

    private String postOrderTraversal(BinaryTree.Node node) {
    if (node == null) return "";
    return postOrderTraversal(node.left) + postOrderTraversal(node.right) + node.value + ", ";
    }
    
    private void btnInOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrderActionPerformed
        // TODO add your handling code here:
         String result = inOrderTraversal(root);
    txtOutput.setText(result);
    }//GEN-LAST:event_btnInOrderActionPerformed

    private String inOrderTraversal(BinaryTree.Node node) {
    if (node == null) return "";
    return inOrderTraversal(node.left) + node.value + ", " + inOrderTraversal(node.right);
    }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
         root = new BinaryTree.Node(); // Set the root to a new node, effectively clearing the tree
         drawTree();
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void displayNumbers(int[] array, int currentIndex, int compareIndex) {
    lstNumbersSort.clearSelection();
    lstNumbersSort.removeAllItems();
    for (int i = 0; i < array.length; i++) {
        String itemText = Integer.toString(array[i]);
        if (i == currentIndex || i == compareIndex) {
            itemText = "[" + itemText + "]";
        }
        lstNumbersSort.addItem(itemText);
    }
}

private void displayNumbersPigeonhole(int[] numbers) {
    lstNumbersSort.removeAllItems();
    for (int number : numbers) {
        lstNumbersSort.addItem(Integer.toString(number));
    }
}

private void displayNumbersRadix(int[] numbers) {
    lstNumbersSort.removeAllItems();
    for (int number : numbers) {
        lstNumbersSort.addItem(number);
    }
}

private void showMessage(String message) {
    lblStatus.setText(message);  // Update a label on the form
    lblStatus.repaint();
}

private void displayNumbersMerge(int[] array, String message) {
    lstNumbersSort.removeAllItems();
    lstNumbersSort.addItem(message);
    lstNumbersSort.addItem("[" + String.join(", ", Arrays.stream(array).mapToObj(Integer::toString).toArray(String[]::new)) + "]");
    lstNumbersSort.addItem("");  // Add an empty line to separate steps
}
private void drawTree() {
    // Este método será usado para dibujar el árbol en un JPanel
    Graphics g = panelTree.getGraphics();
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, panelTree.getWidth(), panelTree.getHeight()); // Limpia el panel antes de dibujar

    if (root.value != null) {
        drawNode(g, root, panelTree.getWidth() / 2, 20, 100); // Comienza a dibujar desde el centro del Panel
    }
}

private void drawNode(Graphics g, BinaryTree.Node node, int x, int y, int xOffset) {
    if (node == null) return;

    // Limitar la posición dentro del Panel
    int panelWidth = panelTree.getWidth();
    int panelHeight = panelTree.getHeight();

    // Asegurar que las coordenadas x, y no se salgan del área del Panel
    x = Math.max(30, Math.min(panelWidth - 30, x));   // Limita x entre 30 y panelWidth - 30
    y = Math.max(30, Math.min(panelHeight - 30, y));  // Limita y entre 30 y panelHeight - 30

    // Dibuja el nodo
    g.setColor(Color.LIGHT_GRAY);
    g.fillOval(x - 15, y - 15, 30, 30);
    g.setColor(Color.BLACK);
    g.drawString(node.value.toString(), x - 10, y - 10);

    // Dibuja las aristas
    if (node.left != null) {
        int leftX = x - xOffset;
        int leftY = y + 60;
        g.drawLine(x, y, leftX, leftY);
        drawNode(g, node.left, leftX, leftY, xOffset / 2);
    }

    if (node.right != null) {
        int rightX = x + xOffset;
        int rightY = y + 60;
        g.drawLine(x, y, rightX, rightY);
        drawNode(g, node.right, rightX, rightY, xOffset / 2);
    }
}




      private void updateQueueDisplay(Object queue, JList<String> listBox) {
     DefaultListModel<String> model = new DefaultListModel<>();
     listBox.setModel(model);

     if (queue instanceof StaticQueue) {
        StaticQueue staticQueue = (StaticQueue) queue;
        StaticQueue tempQueue = new StaticQueue(staticQueue.getCapacity());

        while (!staticQueue.isEmpty()) {
            int value = staticQueue.dequeue();
            model.addElement(String.valueOf(value));
            tempQueue.enqueue(value);
        }

        // Restaurar los elementos a la cola estática
        while (!tempQueue.isEmpty()) {
            staticQueue.enqueue(tempQueue.dequeue());
        }
     } else if (queue instanceof DynamicQueue) {
        DynamicQueue dynamicQueue = (DynamicQueue) queue;
        DynamicQueue tempQueue = new DynamicQueue();

        while (!dynamicQueue.isEmpty()) {
            int value = dynamicQueue.dequeue();
            model.addElement(String.valueOf(value));
            tempQueue.enqueue(value);
        }

        // Restaurar los elementos a la cola dinámica
        while (!tempQueue.isEmpty()) {
            dynamicQueue.enqueue(tempQueue.dequeue());
        }
     } else if (queue instanceof CircularQueue) {
        CircularQueue circularQueue = (CircularQueue) queue;
        CircularQueue tempQueue = new CircularQueue(circularQueue.getCapacity());

        while (!circularQueue.isEmpty()) {
            int value = circularQueue.dequeue();
            model.addElement(String.valueOf(value));
            tempQueue.enqueue(value);
        }

        // Restaurar los elementos a la cola circular
        while (!tempQueue.isEmpty()) {
            circularQueue.enqueue(tempQueue.dequeue());
        }
     }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Proyect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Proyect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContains;
    private javax.swing.JButton BtnCout;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddEdge;
    private javax.swing.JButton btnAddNode;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteFront;
    private javax.swing.JButton btnDeleteRear;
    private javax.swing.JButton btnDequeue;
    private javax.swing.JButton btnDequeuePriorityQueue;
    private javax.swing.JButton btnEnqueue;
    private javax.swing.JButton btnEnqueuePriorityQueue;
    private javax.swing.JButton btnGetFront;
    private javax.swing.JButton btnGetRear;
    private javax.swing.JButton btnInOrder;
    private javax.swing.JButton btnInsertFront;
    private javax.swing.JButton btnInsertNode;
    private javax.swing.JButton btnInsertRear;
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPeekPriorityQueue;
    private javax.swing.JButton btnPeekQueue;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPostOrder;
    private javax.swing.JButton btnPreOrder;
    private javax.swing.JButton btnPriorityQueueSize;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnRemoveAll;
    private javax.swing.JButton btnRemoveEdge;
    private javax.swing.JButton btnRemoveNode;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSetNumbers;
    private javax.swing.JButton btnShowBFS;
    private javax.swing.JButton btnShowDFS;
    private javax.swing.JButton btnShowDFSRecursive;
    private javax.swing.JButton btnSize;
    private javax.swing.JButton btnSizeDoubleQueue;
    private javax.swing.JButton btnSizeQueue;
    private javax.swing.JButton btnSort;
    private javax.swing.JCheckBox chkDirected;
    private javax.swing.JComboBox<String> cmbAlgoritms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList<String> lstCircularList;
    private javax.swing.JList<String> lstCircularQueue;
    private javax.swing.JList<String> lstDoubleCircularList;
    private javax.swing.JList<String> lstDoubleList;
    private javax.swing.JList<String> lstDynamicQueue;
    private javax.swing.JList<String> lstDynamicStack;
    private javax.swing.JList<String> lstNumbersSort;
    private javax.swing.JList<String> lstPriorityQueueLL;
    private javax.swing.JList<String> lstPriorityQueueLV;
    private javax.swing.JList<String> lstPriorityQueueVL;
    private javax.swing.JList<String> lstPriorityQueueVV;
    private javax.swing.JList<String> lstQueueDobleVector;
    private javax.swing.JList<String> lstQueueDoubleList;
    private javax.swing.JList<String> lstSimpleLinkedList;
    private javax.swing.JList<String> lstStaticQueue;
    private javax.swing.JList<String> lstStaticStack;
    private javax.swing.JPanel panelTree;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtGraphRepresentation;
    private javax.swing.JTextField txtNode;
    private javax.swing.JTextField txtNodeValue;
    private javax.swing.JTextField txtOutput;
    private javax.swing.JTextField txtPriorityQueueLevel;
    private javax.swing.JTextField txtQueueDoubleValue;
    private javax.swing.JTextField txtQueuePriorityValue;
    private javax.swing.JTextField txtStackValue;
    private javax.swing.JTextField txtStartNode;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtValue;
    private javax.swing.JTextField txtValueSimpleQueue;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
