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
/*    */ public class MP_vue extends JFrame
/*    */ {
/* 17 */   public JButton ajouter = new JButton("Ajouter Matières Premières");
/* 18 */   public JButton modifier = new JButton("Modifier Matières Premières");
/* 19 */   public JButton supprimer = new JButton("Supprimer Matières Premières");
/* 20 */   public JButton imprimer = new JButton("Consulter / Imprimer");
/* 21 */   public JButton retour = new JButton("Retour");
/*    */   private static final long serialVersionUID = -3247368018884831521L;
/*    */ 
/*    */   public MP_vue()
/*    */   {
/* 30 */     JPanel connex = new JPanel(new GridLayout(7, 1));
/* 31 */     getContentPane().add(connex, "Center");
/* 32 */     setTitle("Stellinox - Matières Premieres");
/* 33 */     setResizable(false);
/* 34 */     setSize(500, 400);
/* 35 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/* 36 */     JPanel Titre = new JPanel(new GridLayout(1, 1));
/* 37 */     JLabel titre = new JLabel("Matières Premières");
/* 38 */     Font policeTitre = new Font("Arial", 1, 18);
/* 39 */     titre.setFont(policeTitre);
/* 40 */     titre.setHorizontalAlignment(0);
/* 41 */     Titre.add(titre);
/* 42 */     connex.add(Titre);
/*    */ 
/* 48 */     JPanel ajout = new JPanel(new FlowLayout());
/* 49 */     this.ajouter.setPreferredSize(new Dimension(400, 30));
/* 50 */     ajout.add(this.ajouter);
/*    */ 
/* 52 */     JPanel modi = new JPanel(new FlowLayout());
/* 53 */     this.modifier.setPreferredSize(new Dimension(400, 30));
/* 54 */     modi.add(this.modifier);
/*    */ 
/* 56 */     JPanel supp = new JPanel(new FlowLayout());
/* 57 */     this.supprimer.setPreferredSize(new Dimension(400, 30));
/* 58 */     supp.add(this.supprimer);
/*    */ 
/* 60 */     JPanel impri = new JPanel(new FlowLayout());
/* 61 */     this.imprimer.setPreferredSize(new Dimension(400, 30));
/* 62 */     impri.add(this.imprimer);
/*    */ 
/* 64 */     JPanel ret = new JPanel(new FlowLayout());
/* 65 */     this.retour.setPreferredSize(new Dimension(400, 30));
/* 66 */     ret.add(this.retour);
/*    */ 
/* 68 */     connex.add(ajout);
/* 69 */     connex.add(modi);
/* 70 */     connex.add(supp);
/* 71 */     connex.add(impri);
/* 72 */     connex.add(ret);
/*    */ 
/* 78 */     String format = "dd/MM/yy";
/* 79 */     SimpleDateFormat formater = new SimpleDateFormat(format);
/* 80 */     Date date = new Date();
/* 81 */     String Date = formater.format(date);
/* 82 */     JLabel bas = new JLabel("Production - " + Date);
/* 83 */     bas.setHorizontalAlignment(4);
/* 84 */     connex.add(bas);
/*    */ 
/* 86 */     setLocationRelativeTo(null);
/* 87 */     setVisible(true);
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.MP_vue
 * JD-Core Version:    0.6.2
 */