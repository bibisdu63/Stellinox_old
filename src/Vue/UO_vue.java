/*    */ package Vue;
/*    */ 
/*    */ import java.awt.Container;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.FlowLayout;
/*    */ import java.awt.Font;
/*    */ import java.awt.GridLayout;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class UO_vue extends JFrame
/*    */ {
/*    */   private static final long serialVersionUID = -6053469231442684767L;
/* 19 */   public JButton ajouter = new JButton("Ajouter Unités Opératoires");
/* 20 */   public JButton modifier = new JButton("Modifier Unités Opératoires");
/* 21 */   public JButton supprimer = new JButton("Supprimer Unités Opératoires");
/* 22 */   public JButton imprimer = new JButton("Consulter / Imprimer");
/* 23 */   public JButton retour = new JButton("Retour");
/* 24 */   private String nom = null;
/*    */ 
/*    */   public UO_vue(String nom) {
/* 27 */     this.nom = nom;
/*    */ 
/* 31 */     JPanel connex = new JPanel(new GridLayout(7, 1));
/* 32 */     getContentPane().add(connex, "Center");
/* 33 */     setTitle("Stellinox - Unités Opératoires");
/* 34 */     setResizable(false);
/* 35 */     setSize(500, 300);
/* 36 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/* 37 */     JPanel Titre = new JPanel(new GridLayout(1, 1));
/* 38 */     JLabel titre = new JLabel("Unités Opératoires");
/* 39 */     Font policeTitre = new Font("Arial", 1, 18);
/* 40 */     titre.setFont(policeTitre);
/* 41 */     titre.setHorizontalAlignment(0);
/* 42 */     Titre.add(titre);
/* 43 */     connex.add(Titre);
/*    */ 
/* 49 */     JPanel ajout = new JPanel(new FlowLayout());
/* 50 */     this.ajouter.setPreferredSize(new Dimension(400, 30));
/* 51 */     ajout.add(this.ajouter);
/*    */ 
/* 53 */     JPanel modi = new JPanel(new FlowLayout());
/* 54 */     this.modifier.setPreferredSize(new Dimension(400, 30));
/* 55 */     modi.add(this.modifier);
/*    */ 
/* 57 */     JPanel supp = new JPanel(new FlowLayout());
/* 58 */     this.supprimer.setPreferredSize(new Dimension(400, 30));
/* 59 */     supp.add(this.supprimer);
/*    */ 
/* 61 */     JPanel impri = new JPanel(new FlowLayout());
/* 62 */     this.imprimer.setPreferredSize(new Dimension(400, 30));
/* 63 */     impri.add(this.imprimer);
/*    */ 
/* 65 */     JPanel ret = new JPanel(new FlowLayout());
/* 66 */     this.retour.setPreferredSize(new Dimension(400, 30));
/* 67 */     ret.add(this.retour);
/*    */ 
/* 69 */     connex.add(ajout);
/* 70 */     connex.add(modi);
/* 71 */     connex.add(supp);
/* 72 */     connex.add(impri);
/* 73 */     connex.add(ret);
/*    */ 
/* 79 */     String format = "dd/MM/yy";
/* 80 */     SimpleDateFormat formater = new SimpleDateFormat(format);
/* 81 */     Date date = new Date();
/* 82 */     String Date = formater.format(date);
/* 83 */     JLabel bas = new JLabel(this.nom + "  " + Date);
/* 84 */     bas.setHorizontalAlignment(4);
/* 85 */     connex.add(bas);
/*    */ 
/* 87 */     setLocationRelativeTo(null);
/* 88 */     setVisible(true);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.UO_vue
 * JD-Core Version:    0.6.2
 */