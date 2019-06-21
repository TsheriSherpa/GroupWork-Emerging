/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupework;

import com.sun.glass.events.KeyEvent;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Acer
 */
public class LaptopInformationSystem extends javax.swing.JFrame {
    private DefaultTableModel model;
    private String Id;
    private String name;
    private String brand;
    private String Price;
    private String storageType;
    private Object selectedItem;
    private String storage;
    private boolean empty;
    private boolean itemEmpty;
    private boolean radioButtonEmpty;
    private boolean Empty;
    private ArrayList<Model> list=new ArrayList<>();
    private int [] priceList;
    private ArrayList <Integer>newList;
    private static boolean found;
    private boolean dontChange;
    JFileChooser chooser;

    public void getRowToArrayList(){
        String [][]data={
           {"1","Acer-e5","acer","256 GB","HDD","50000"},
           {"2","Acer-predator","acer","1000 GB","SSD","70000"},
           {"3","Acer swift","acer","500 GB","HDD","90000"},
           {"4","Alienware","dell","500 GB","SSD","100000"},
           {"5","Legion","lenevo","1000 GB","SSD","114000"},
           {"6","Dell-XPS","dell","800 GB","HDD","150000"},
           {"7","Razeer-11","razer","1000 GB","SSD","180000"},
           {"8","Macbook Air","apple","1500 GB","SSD","190000"},
           {"9","Omen","hp","1500 GB","SSD","200000"},  
           {"10","Alienware-11","dell","2000 GB","HDD","210000"},
           {"11","Legion-Pro","lenevo","2000 GB","HDD","224000"},
           {"12","Dell-Vostro","dell","1800 GB","SSD","250000"},
           {"13","Macbook-Pro","apple","2000 GB","SSD","280000"},
           {"14","Macbook Air","apple","1500 GB","SSD","290000"},
           {"15","Hp lite","hp","1500 GB","SSD","290000"},  
        };
        for (int i=0;i<data.length;i++)
        {
            String id=data[i][0];
            String lname=data[i][1];
            String bname=data[i][2];
            String storages=data[i][3];
            String storagesType=data[i][4];
            String prices=data[i][5];
            list.add(new Model(id,lname,bname,storages,storagesType,prices));
        }
    }
    public static void sort(int a[]) // this method takes integer array and sort it in ascending order
    {
        for(int i=0;i<a.length;i++)
        {
            int minPos=minPosition(a,i); 
            LaptopInformationSystem.ArrayUtil.swap(a,minPos,i); // this method swap the minum value to infront
        }
        
    }
    public static int minPosition(int a[],int form)  // this method returns the minimum psotion in the given array 
    {
        int minPos=form;
        for(int i=form+1;i<a.length;i++)
        {
            if(a[i]<a[minPos])
            {
                minPos=i;  
            }
        }
        return minPos;
    }

    private String getAbsolutePath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static class ArrayUtil // declaring the static inner class 
    {
        public static void swap(int a[],int minPos,int i) // this method swaps the item in array.
        {
            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        }
        
    }
    public static void binarySearch(int arr[], int first, int last, int key)// this method is used for searching item in given array
    {  
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;   
            }else if ( arr[mid] == key ){
                found=true;
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            found =false;
        }
    }
    
    public LaptopInformationSystem() 
    {
        initComponents();
        getRowToArrayList();   //method to store all the data in arraylist as object of inner class Model for multi-purpose
        showData();        //method to load static data in a table.
        
    }
   
    public void showData()// this mthod is used to populate the jtable
    {  
        model=(DefaultTableModel) jTable1.getModel();  //getting the model of the jtable
        Object []rowData=new Object[6];
            for(int i = 0; i < list.size(); i++)
            {
                rowData[0] = list.get(i).id;
                rowData[1] = list.get(i).lname;
                rowData[2] = list.get(i).bname;
                rowData[3] = list.get(i).storages;
                rowData[4] = list.get(i).storagesType;
                rowData[5] = list.get(i).prices;
                model.addRow(rowData);
            }
    }
    private void filter(String query) // this method search the given string in the jtable.
    {    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        laptopID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        laptopName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        brandName = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        laptopPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        brandName1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        view = new javax.swing.JComboBox<>();
        reload = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        newJFrame = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 600));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Latptop ID");

        laptopID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopIDActionPerformed(evt);
            }
        });
        laptopID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                laptopIDKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Laptop Name");

        laptopName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopNameActionPerformed(evt);
            }
        });
        laptopName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                laptopNameKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Brand Name");

        brandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandNameActionPerformed(evt);
            }
        });
        brandName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                brandNameKeyTyped(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Storage--", "128 GB", "256 GB", "500 GB", "1000GB" }));

        laptopPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopPriceActionPerformed(evt);
            }
        });
        laptopPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                laptopPriceKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Storage Type");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("SSD");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("HDD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Laptop Price");

        add.setBackground(new java.awt.Color(0, 255, 102));
        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 204, 153));
        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Add Laptop to store");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Laptop Information System");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Laptop ID", "Laptop Name", "Brand Name", "Storage", "Storage Type", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        brandName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandName1ActionPerformed(evt);
            }
        });
        brandName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                brandName1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                brandName1KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Brand Name");

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");

        search.setBackground(new java.awt.Color(51, 255, 51));
        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 204, 153));
        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("Delete Row");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        view.setBackground(new java.awt.Color(204, 153, 0));
        view.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        view.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "View all available", "View only SSD", "View only HDD" }));
        view.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                viewItemStateChanged(evt);
            }
        });
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        reload.setBackground(new java.awt.Color(255, 102, 0));
        reload.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reload.setText("Reload");
        reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reload, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(brandName1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(brandName1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reload, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(laptopName)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(brandName)
                                            .addComponent(jComboBox1, 0, 213, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(laptopPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(laptopID, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(laptopID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laptopName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brandName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(laptopPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("File");

        openFile.setText("Open File");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        newJFrame.setText("About");
        newJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newJFrameActionPerformed(evt);
            }
        });
        jMenu1.add(newJFrame);

        jMenuItem2.setText("Save File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Help");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tools");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("View");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laptopIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptopIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laptopIDActionPerformed

    private void laptopNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptopNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laptopNameActionPerformed

    private void laptopPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptopPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laptopPriceActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        Id= laptopID.getText();
        name=laptopName.getText();
        brand=brandName.getText();
        Price=laptopPrice.getText();
        storageType = null;
        selectedItem = jComboBox1.getSelectedItem();
        storage = selectedItem.toString();
        empty=false;
        itemEmpty=false;
        radioButtonEmpty=false;
        Empty=false;
        if(jRadioButton1.isSelected())
        {
            storageType="SSD";
        }else if(jRadioButton2.isSelected())
        {
            storageType="HDD";
        }else
        {
            radioButtonEmpty=true;
        }
        
        String [] info={Id,name,brand,storage,storageType,Price};
        if(storage=="--Select Storage--")
        {
           itemEmpty=true;
        }
        
        if(Id.isEmpty())
        {
            Empty=true;
            JOptionPane.showMessageDialog(rootPane,"Please Enter the id of laptop.");
        }else if(name.isEmpty())
        {
            Empty=true;
            JOptionPane.showMessageDialog(rootPane,"Please! Enter laptop model.");
        }else if(brand.isEmpty())
        {
            Empty=true;
            JOptionPane.showMessageDialog(rootPane,"Please Enter the brand name.");
        }
        else if(Price.isEmpty())
        {
            Empty=true;
            JOptionPane.showMessageDialog(rootPane,"Please Enter the price.");
        }else if(radioButtonEmpty)
        {
            Empty=true;
            JOptionPane.showMessageDialog(rootPane,"Please Select the storage type."); 
        }else if(itemEmpty)
        {
            Empty=true;
            JOptionPane.showMessageDialog(rootPane,"Please Select the Storage size.");
        }
            
        //DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        if(!Empty)
        {  
           model.addRow(new Object[]{Id,name,brand,storage,storageType,Price});
           JOptionPane.showMessageDialog(this, "Successfully Added.");
        }
    }//GEN-LAST:event_addActionPerformed

    private void brandName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandName1ActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        dontChange=true; //for not giving message in view combox clear 
        laptopID.setText("");
        laptopName.setText("");
        brandName.setText("");
        buttonGroup1.clearSelection();
        jComboBox1.setSelectedIndex(0);
        price.setText("");
        view.setSelectedIndex(0);
        brandName1.setText("");
        laptopPrice.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        if(!price.getText().toString().isEmpty()) // checking if price field for searching is empty or not
        { 
            int []sortedPriceList;
            priceList=new int[list.size()];
            for(int i=0;i<list.size();i++)
            {
                priceList[i]=Integer.parseInt(list.get(i).prices);
            }
            sortedPriceList=Arrays.copyOf(priceList,priceList.length);   //creating the copy of array using Arrays's class function.
            LaptopInformationSystem.sort(sortedPriceList);
            int key = Integer.parseInt(price.getText().toString());
            int last=priceList.length-1;
            binarySearch(sortedPriceList,0,last,key);	
            if(found){
                for(int i=0;i<priceList.length;i++)
                {
                    if(priceList[i]==key){
                        newList=new ArrayList<Integer>();    //creating arraylist to hold the index where the key match
                        newList.add(i);
                        if((i+1<priceList.length)){             
                            if(priceList[i+1]==key){     //checking if the item next one step right from matched item matches key or not
                                newList.add(i+1);
                                
                            }
                        }else if(!(i-1<0)){
                            if(priceList[i-1]==key){    //checking if the item next one step left from matched item matches key or not
                                newList.add(i-1);
                                
                            }
                        } 
                       
                    }
                    
               }
                
                ArrayList<String []> ar=new ArrayList<String[]>(); //creating arraylist of array
                String [] dd= new String[6];                       //creating random array with size 6 two add in arraylist
                String [] ee=new String[6];
                ar.add(dd);                                         //adding array to arraylist
                ar.add(ee);
                
                for(int k=0;k<newList.size();k++){   
                    String itemID=list.get(newList.get(k)).id;
                    String itemName=list.get(newList.get(k)).lname;
                    String itemBrand=list.get(newList.get(k)).bname;
                    String itemStorage=list.get(newList.get(k)).storages;
                    String itemStorageType=list.get(newList.get(k)).storagesType;
                    String itemPrice=list.get(newList.get(k)).prices;
                    ar.get(k)[0]=itemID;                            //adding item to array inside arraylist
                    ar.get(k)[1]=(itemName);
                    ar.get(k)[2]=(itemBrand);
                    ar.get(k)[3]=(itemStorage);
                    ar.get(k)[4]=(itemStorageType);
                    ar.get(k)[5]=(itemPrice);
                }
                Object []obj=new Object[6];       //creating array with size 6 that hold object 
                model.setRowCount(0);             //setting the row count of table to 0;
                for(int l=0;l<ar.size();l++){
                    for(int j=0;j<dd.length;j++){                
                        obj[j]=ar.get(l)[j];           //adding the details of searched and found item in array
                    }
                    
                    model.addRow(obj);              //displaying or adding searched and found item to the table
                }            
            }
            else{
                JOptionPane.showMessageDialog(this,"Sorry No item availabel in this price.");
            }
        }else
        {
            JOptionPane.showMessageDialog(this,"Please, input price to search.");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        
    }//GEN-LAST:event_viewActionPerformed

    private void laptopIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_laptopIDKeyTyped
        char c=evt.getKeyChar(); // getting the character typed from jtextfield
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {//checking if character is digit,backsppace or delete key
            getToolkit().beep(); // this is builtin function which produce beep sound
            evt.consume(); // this method consume the key press or ignore
            JOptionPane.showMessageDialog(this,"Enter Number Only. ");
        }
    }//GEN-LAST:event_laptopIDKeyTyped

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        char c=evt.getKeyChar(); //getting the character typed from text field
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE))) //checks if character typed is not digit or backspace or delete key
        {
            getToolkit().beep(); //making the beep sound
            evt.consume();       //consuming the key typed event.
            JOptionPane.showMessageDialog(this,"Enter Number Only. "); //showing message to jOptionPane

        }                                    
    
    }//GEN-LAST:event_priceKeyTyped

    private void laptopPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_laptopPriceKeyTyped
       char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Enter Number only. ");

        }                                    
    
    }//GEN-LAST:event_laptopPriceKeyTyped

    private void laptopNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_laptopNameKeyTyped

    }//GEN-LAST:event_laptopNameKeyTyped

    private void brandNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandNameKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isLetter(c) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)|| (c==KeyEvent.VK_SPACE)))
        {
            getToolkit().beep(); 
            evt.consume();
            JOptionPane.showMessageDialog(this,"Enter String only. ");

        }
    }//GEN-LAST:event_brandNameKeyTyped

    private void brandName1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandName1KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isLetter(c) || (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Enter String only. ");
        }
    }//GEN-LAST:event_brandName1KeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void brandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandNameActionPerformed

    private void brandName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandName1KeyReleased
        String query=brandName1.getText().toLowerCase();
        filter(query);
    }//GEN-LAST:event_brandName1KeyReleased

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            int SelectedRowIndex=jTable1.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"No row Selected.");
        }
    }//GEN-LAST:event_deleteActionPerformed
    
    class Model
    {   //creating the inner class
        String id;
        String lname;
        String bname;
        String storages;
        String storagesType;
        String prices;
    
        // innner class constructor
        public Model(String id,String lname,String bname,String storages,String storagesType, String prices)
        {
            this.id =id;
            this.bname=bname;
            this.lname=lname;
            this.storages=storages;
            this.storagesType=storagesType;
            this.prices=prices;
        }
    }
    private void viewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_viewItemStateChanged
        
        Object choosenItem =view.getSelectedItem();
        String Storage = choosenItem.toString();
        Object rowData[] = new Object[6];
        int count=0;
        if(Storage=="View all available")//checks if view all available is selected in view combobox
        {
            model.setRowCount(0);
            for(int i = 0; i < list.size(); i++)
            {
                rowData[0] = list.get(i).id;
                rowData[1] = list.get(i).lname;
                rowData[2] = list.get(i).bname;
                rowData[3] = list.get(i).storages;
                rowData[4] = list.get(i).storagesType;
                rowData[5] = list.get(i).prices;
                model.addRow(rowData);    //adding to jtable
            }
            if(!dontChange){
                JOptionPane.showMessageDialog(this,"There are "+list.size()+" items in this category.");
            }
        }
        else if(Storage=="View only SSD"){ //checks if view only SSD is selected in view combobox
            model.setRowCount(0);
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i).storagesType=="SSD")
                {   
                    count++;
                    rowData[0] = list.get(i).id;
                    rowData[1] = list.get(i).lname;
                    rowData[2] = list.get(i).bname;    
                    rowData[3] = list.get(i).storages;
                    rowData[4] = list.get(i).storagesType;
                    rowData[5] = list.get(i).prices;
                    model.addRow(rowData);
                }
            }
            JOptionPane.showMessageDialog(this,"There are "+count+" items in this category.");
        }
        else if(Storage=="View only HDD")//checks if view only HDD is selected in view combobox
        {   
            model.setRowCount(0);
            for(int i=0;i<list.size();i++)
            {  
                if(list.get(i).storagesType=="HDD")
                {
                    count++;
                    rowData[0] = list.get(i).id;
                    rowData[1] = list.get(i).lname;
                    rowData[2] = list.get(i).bname;
                    rowData[3] = list.get(i).storages;
                    rowData[4] = list.get(i).storagesType;
                    rowData[5] = list.get(i).prices;
                    model.addRow(rowData);
                }
            }
            JOptionPane.showMessageDialog(this,"There are "+count+" items in this category.");
        }
        
    }//GEN-LAST:event_viewItemStateChanged

    private void reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadActionPerformed
        //this method is used to reload all the data in jtable
        Object rowData[] = new Object[6];  
        model.setRowCount(0);
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).id;
            rowData[1] = list.get(i).lname;
            rowData[2] = list.get(i).bname;
            rowData[3] = list.get(i).storages;
            rowData[4] = list.get(i).storagesType;
            rowData[5] = list.get(i).prices;
            model.addRow(rowData);
        }
    }//GEN-LAST:event_reloadActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        try //exception handling for JFileChooser
        {   
            chooser= new JFileChooser();  //creating JFileChooser object 
            chooser.showOpenDialog(this);    //open the JFileChooser with open file dialog
            File f=chooser.getSelectedFile();  //getting the selected file from JFileChoooser
            String filePath= f.getAbsolutePath();  //getting the path of the selected file
            try         //This is try catch statement for handling errors while reading or opeing file
            {
                Desktop.getDesktop().open(new java.io.File(filePath));    //This line is used to open file from the computer .
            }catch(Exception e)
            {
                e.printStackTrace();    // This is the error message which is printed when errors occurs.
            }
            
        }catch(Exception e)  //JFile Chooser error catch block
        {
            System.out.println("Error occured");  
        }
        
    }//GEN-LAST:event_openFileActionPerformed

    private void newJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newJFrameActionPerformed
         NewJFrame obj=new NewJFrame(); //creating new object of NewJFrame class
         obj.loadFrame();  //invoking method of NewJFrame class 
    }//GEN-LAST:event_newJFrameActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try         //This is try catch statement for handling errors while opening file
        {
            Desktop.getDesktop().open(new java.io.File("src/File/user manual.pdf"));    //This line is used to open file from the computer .
        }catch(Exception e)
        {
            e.printStackTrace();    // This is the error message which is printed when errors occurs.
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        chooser=new JFileChooser(new File("C:\\Users\\Acer\\Documents\\NetBeansProjects\\Groupework\\src\\File"));
        chooser.setDialogTitle("Save a File");
        chooser.setFileFilter(new FileNameExtensionFilter("Text files","txt"));
        int result=chooser.showSaveDialog(null);
        String rowData[] = new String[6];
        if(result== JFileChooser.APPROVE_OPTION){ //returns if approve is choosen
            
            File f=chooser.getSelectedFile();     //gettting the selected file from jFileChooser
            try{
                FileWriter fw=new FileWriter(f.getPath());  // creating object of file writer to write in a file
                
                for(int i = 0; i < list.size(); i++)
                {
                    rowData[0] = list.get(i).id;
                    rowData[1] = list.get(i).lname;
                    rowData[2] = list.get(i).bname;
                    rowData[3] = list.get(i).storages;
                    rowData[4] = list.get(i).storagesType;
                    rowData[5] = list.get(i).prices;
                    for(int j=0;j<rowData.length;j++){
                        fw.write(rowData[j]);    //writing to a file
                        fw.write(" ");
                    }
                    fw.write("    " );
                }
                 
                fw.flush();  //clear all the stream and flush all the buffers in a chain of Writers and OutputStreams.
                fw.close();    //closing file always recommended
                JOptionPane.showMessageDialog(null, "Successfully saved");
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(LaptopInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaptopInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaptopInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaptopInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaptopInformationSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField brandName;
    private javax.swing.JTextField brandName1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField laptopID;
    private javax.swing.JTextField laptopName;
    private javax.swing.JTextField laptopPrice;
    private javax.swing.JMenuItem newJFrame;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JTextField price;
    private javax.swing.JButton reload;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> view;
    // End of variables declaration//GEN-END:variables
}
