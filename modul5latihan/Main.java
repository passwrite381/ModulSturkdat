/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5latihan;

/**
 *
 * @author diazh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();
        
        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);
        
        System.out.print("\nPre Order : ");
        pohon.preOrder(pohon.root);
        System.out.print("\nIn Order : ");
        pohon.inOrder(pohon.root);
        System.out.print("\nPost Order : ");
        pohon.postOrder(pohon.root);
    }
}
