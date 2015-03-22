/*     */ package Vue;
/*     */ 
/*     */ import Modele.Menu_Modele;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import main.IMenu_vue;
/*     */ 
/*     */ public class Menu_vue_production extends JFrame
/*     */   implements IMenu_vue
/*     */ {
/*     */   private static final long serialVersionUID = -1010748517743790044L;
/*     */   Menu_Modele modele;
/*     */ 
/*     */   public Menu_vue_production(Menu_Modele modele)
/*     */   {
/*  26 */     this.modele = modele;
/*     */ 
/*  30 */     JPanel connex = new JPanel(new GridLayout(9, 1));
/*  31 */     getContentPane().add(connex, "Center");
/*  32 */     setTitle("Stellinox - Menu");
/*  33 */     setSize(500, 400);
/*  34 */     setResizable(false);
/*  35 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  36 */     JLabel titre = new JLabel("Menu");
/*  37 */     Font policeTitre = new Font("Arial", 1, 18);
/*  38 */     titre.setFont(policeTitre);
/*  39 */     titre.setHorizontalAlignment(0);
/*  40 */     connex.add(titre);
/*     */ 
/*  46 */     JPanel mp = new JPanel(new FlowLayout());
/*  47 */     MP.setPreferredSize(new Dimension(400, 30));
/*  48 */     mp.add(MP);
/*     */ 
/*  50 */     JPanel uo = new JPanel(new FlowLayout());
/*  51 */     UO.setPreferredSize(new Dimension(400, 30));
/*  52 */     uo.add(UO);
/*     */ 
/*  54 */     JPanel cf = new JPanel(new FlowLayout());
/*  55 */     creer_fiche.setPreferredSize(new Dimension(400, 30));
/*  56 */     cf.add(creer_fiche);
/*     */ 
/*  58 */     JPanel mf = new JPanel(new FlowLayout());
/*  59 */     modifier_fiche.setPreferredSize(new Dimension(400, 30));
/*  60 */     mf.add(modifier_fiche);
/*     */ 
/*  62 */     JPanel cons = new JPanel(new FlowLayout());
/*  63 */     consulter.setPreferredSize(new Dimension(400, 30));
/*  64 */     cons.add(consulter);
/*     */ 
/*  66 */     JPanel ret = new JPanel(new FlowLayout());
/*  67 */     retour.setPreferredSize(new Dimension(400, 30));
/*  68 */     ret.add(retour);
/*     */ 
/*  70 */     JPanel sauv = new JPanel(new FlowLayout());
/*  71 */     sauvegarder.setPreferredSize(new Dimension(400, 30));
/*  72 */     sauv.add(sauvegarder);
/*     */ 
/*  74 */     connex.add(sauv);
/*  75 */     connex.add(mp);
/*  76 */     connex.add(uo);
/*  77 */     connex.add(cf);
/*  78 */     connex.add(mf);
/*  79 */     connex.add(cons);
/*  80 */     connex.add(ret);
/*     */ 
/*  88 */     String format = "dd/MM/yy";
/*  89 */     SimpleDateFormat formater = new SimpleDateFormat(format);
/*  90 */     Date date = new Date();
/*  91 */     String Date = formater.format(date);
/*  92 */     JLabel bas = new JLabel("Production - " + Date);
/*  93 */     bas.setHorizontalAlignment(4);
/*  94 */     connex.add(bas);
/*     */ 
/*  96 */     setLocationRelativeTo(null);
/*  97 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void arret()
/*     */   {
/* 103 */     dispose();
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.Menu_vue_production
 * JD-Core Version:    0.6.2
 */