/*    */ package Vue;
/*    */ 
/*    */ import Modele.Menu_Modele;
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
/*    */ import main.IMenu_vue;
/*    */ 
/*    */ public class Menu_vue_commercial extends JFrame
/*    */   implements IMenu_vue
/*    */ {
/*    */   private static final long serialVersionUID = -59853043401706380L;
/*    */   Menu_Modele modele;
/*    */ 
/*    */   public Menu_vue_commercial(Menu_Modele modele)
/*    */   {
/* 26 */     this.modele = modele;
/*    */ 
/* 30 */     JPanel connex = new JPanel(new GridLayout(5, 1));
/* 31 */     getContentPane().add(connex, "Center");
/* 32 */     setTitle("Stellinox - Menu");
/* 33 */     setSize(500, 300);
/* 34 */     setResizable(false);
/* 35 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/* 36 */     JLabel titre = new JLabel("Menu");
/* 37 */     Font policeTitre = new Font("Arial", 1, 18);
/* 38 */     titre.setFont(policeTitre);
/* 39 */     titre.setHorizontalAlignment(0);
/* 40 */     connex.add(titre);
/*    */ 
/* 46 */     JPanel cons = new JPanel(new FlowLayout());
/* 47 */     consulter.setPreferredSize(new Dimension(400, 30));
/* 48 */     cons.add(consulter);
/*    */ 
/* 50 */     JPanel ret = new JPanel(new FlowLayout());
/* 51 */     retour.setPreferredSize(new Dimension(400, 30));
/* 52 */     ret.add(retour);
/*    */ 
/* 54 */     JPanel list = new JPanel(new FlowLayout());
/* 55 */     liste.setPreferredSize(new Dimension(400, 30));
/* 56 */     list.add(liste);
/*    */ 
/* 58 */     connex.add(cons);
/* 59 */     connex.add(list);
/* 60 */     connex.add(ret);
/*    */ 
/* 64 */     String format = "dd/MM/yy";
/* 65 */     SimpleDateFormat formater = new SimpleDateFormat(format);
/* 66 */     Date date = new Date();
/* 67 */     String Date = formater.format(date);
/* 68 */     JLabel bas = new JLabel("Commercial - " + Date);
/* 69 */     bas.setHorizontalAlignment(4);
/* 70 */     connex.add(bas);
/*    */ 
/* 72 */     setLocationRelativeTo(null);
/* 73 */     setVisible(true);
/*    */   }
/*    */ 
/*    */   public void arret()
/*    */   {
/* 78 */     dispose();
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.Menu_vue_commercial
 * JD-Core Version:    0.6.2
 */