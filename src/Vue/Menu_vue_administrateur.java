/*     */ package Vue;
/*     */ 
/*     */ import Modele.Menu_Modele;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import main.IMenu_vue;
/*     */ 
/*     */ public class Menu_vue_administrateur extends JFrame
/*     */   implements IMenu_vue
/*     */ {
/*     */   private static final long serialVersionUID = 8868571836262610521L;
/*     */   Menu_Modele modele;
/*     */ 
/*     */   public Menu_vue_administrateur(final Menu_Modele modele)
/*     */   {
/*  29 */     final Component parent = this;
/*  30 */     this.modele = modele;
/*     */ 
/*  34 */     JPanel connex = new JPanel(new GridLayout(6, 1));
/*  35 */     getContentPane().add(connex, "Center");
/*  36 */     setTitle("Stellinox - Menu");
/*  37 */     setSize(500, 350);
/*  38 */     setResizable(false);
/*  39 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  40 */     JLabel titre = new JLabel("Menu");
/*  41 */     Font policeTitre = new Font("Arial", 1, 18);
/*  42 */     titre.setFont(policeTitre);
/*  43 */     titre.setHorizontalAlignment(0);
/*  44 */     connex.add(titre);
/*     */ 
/*  51 */     JPanel uo = new JPanel(new FlowLayout());
/*  52 */     sauvegarder.setPreferredSize(new Dimension(400, 30));
/*  53 */     uo.add(sauvegarder);
/*     */ 
/*  55 */     JPanel te = new JPanel(new FlowLayout());
/*  56 */     charger.setPreferredSize(new Dimension(400, 30));
/*  57 */     te.add(charger);
/*     */ 
/*  60 */     JPanel cm = new JPanel(new FlowLayout());
/*  61 */     ajout_utilisateur.setPreferredSize(new Dimension(400, 30));
/*  62 */     cm.add(ajout_utilisateur);
/*     */ 
/*  65 */     JPanel ret = new JPanel(new FlowLayout());
/*  66 */     retour.setPreferredSize(new Dimension(400, 30));
/*  67 */     ret.add(retour);
/*     */ 
/*  69 */     connex.add(uo);
/*  70 */     connex.add(te);
/*  71 */     connex.add(cm);
/*  72 */     connex.add(ret);
/*     */ 
/*  75 */     ajout_utilisateur.addActionListener(new ActionListener()
/*     */     {
/*     */       public void actionPerformed(ActionEvent e)
/*     */       {
/*  79 */         String result_pseudo = JOptionPane.showInputDialog(parent, "nom d'utilisateur", "ajout - pseudo", 3);
/*  80 */         String result_num = JOptionPane.showInputDialog(parent, "Rôle : 1- Production ; 2- Direction ; 3-Commercial", "ajout - rôle", 3);
/*  81 */         Integer res = Integer.valueOf(Integer.parseInt(result_num));
/*  82 */         if ((res.intValue() <= 3) && (res.intValue() > 0))
/*  83 */           modele.creer_user(result_pseudo, res.intValue());
/*     */         else
/*  85 */           JOptionPane.showMessageDialog(parent, "la valeur du rôle doit être inferieur ou égale à 3", "erreur", 0);
/*     */       }
/*     */     });
/*  93 */     String format = "dd/MM/yy";
/*  94 */     SimpleDateFormat formater = new SimpleDateFormat(format);
/*  95 */     Date date = new Date();
/*  96 */     String Date = formater.format(date);
/*  97 */     JLabel bas = new JLabel("Administrateur - " + Date);
/*  98 */     bas.setHorizontalAlignment(4);
/*  99 */     connex.add(bas);
/*     */ 
/* 102 */     setLocationRelativeTo(null);
/* 103 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void arret()
/*     */   {
/* 109 */     dispose();
/* 110 */     setVisible(false);
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.Menu_vue_administrateur
 * JD-Core Version:    0.6.2
 */