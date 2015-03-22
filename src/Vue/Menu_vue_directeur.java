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
/*     */ public class Menu_vue_directeur extends JFrame
/*     */   implements IMenu_vue
/*     */ {
/*     */   private static final long serialVersionUID = 8868571836262610521L;
/*     */   Menu_Modele modele;
/*     */ 
/*     */   public Menu_vue_directeur(final Menu_Modele modele)
/*     */   {
/*  29 */     Component parent = this;
/*  30 */     this.modele = modele;
/*     */ 
/*  34 */     JPanel connex = new JPanel(new GridLayout(13, 1));
/*  35 */     getContentPane().add(connex, "Center");
/*  36 */     setTitle("Stellinox - Menu");
/*  37 */     setSize(500, 550);
/*  38 */     setResizable(false);
/*  39 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  40 */     JLabel titre = new JLabel("Menu");
/*  41 */     Font policeTitre = new Font("Arial", 1, 18);
/*  42 */     titre.setFont(policeTitre);
/*  43 */     titre.setHorizontalAlignment(0);
/*  44 */     connex.add(titre);
/*     */ 
/*  51 */     JPanel uo = new JPanel(new FlowLayout());
/*  52 */     UO.setPreferredSize(new Dimension(400, 30));
/*  53 */     uo.add(UO);
/*     */ 
/*  55 */     JPanel te = new JPanel(new FlowLayout());
/*  56 */     taux_essuyage.setPreferredSize(new Dimension(400, 30));
/*  57 */     te.add(taux_essuyage);
/*     */ 
/*  59 */     JPanel appr = new JPanel(new FlowLayout());
/*  60 */     centre_appro.setPreferredSize(new Dimension(400, 30));
/*  61 */     appr.add(centre_appro);
/*     */ 
/*  63 */     JPanel cm = new JPanel(new FlowLayout());
/*  64 */     coeff_mavet.setPreferredSize(new Dimension(400, 30));
/*  65 */     cm.add(coeff_mavet);
/*     */ 
/*  67 */     JPanel cons = new JPanel(new FlowLayout());
/*  68 */     consulter.setPreferredSize(new Dimension(400, 30));
/*  69 */     cons.add(consulter);
/*     */ 
/*  71 */     JPanel mp = new JPanel(new FlowLayout());
/*  72 */     MP.setPreferredSize(new Dimension(400, 30));
/*  73 */     mp.add(MP);
/*     */ 
/*  75 */     JPanel lis = new JPanel(new FlowLayout());
/*  76 */     liste.setPreferredSize(new Dimension(400, 30));
/*  77 */     lis.add(liste);
/*     */ 
/*  79 */     JPanel cre = new JPanel(new FlowLayout());
/*  80 */     creer_fiche.setPreferredSize(new Dimension(400, 30));
/*  81 */     cre.add(creer_fiche);
/*     */ 
/*  83 */     JPanel mod = new JPanel(new FlowLayout());
/*  84 */     modifier_fiche.setPreferredSize(new Dimension(400, 30));
/*  85 */     mod.add(modifier_fiche);
/*     */ 
/*  87 */     JPanel ret = new JPanel(new FlowLayout());
/*  88 */     retour.setPreferredSize(new Dimension(400, 30));
/*  89 */     ret.add(retour);
/*     */ 
/*  91 */     JPanel sauv = new JPanel(new FlowLayout());
/*  92 */     sauvegarder.setPreferredSize(new Dimension(400, 30));
/*  93 */     sauv.add(sauvegarder);
/*     */ 
/*  95 */     connex.add(sauv);
/*  96 */     connex.add(mp);
/*  97 */     connex.add(uo);
/*  98 */     connex.add(te);
/*  99 */     connex.add(appr);
/* 100 */     connex.add(cm);
/* 101 */     connex.add(cre);
/* 102 */     connex.add(mod);
/* 103 */     connex.add(lis);
/* 104 */     connex.add(cons);
/* 105 */     connex.add(ret);
/*     */ 
/* 113 */     taux_essuyage.addActionListener(new ActionListener()
/*     */     {
/*     */       private Component parent;
/*     */ 
/*     */       public void actionPerformed(ActionEvent e) {
/* 118 */         modele.select_tx_essuyage();
/* 119 */         String result = (String)JOptionPane.showInputDialog(this.parent, "entrez le taux d'essuyage", "taux essuyage", 3, null, null, modele.getTaux());
/*     */ 
/* 121 */         if (result != null)
/*     */         {
/* 123 */           int ret = modele.maj_essuyage(result);
/* 124 */           if (ret == 1)
/* 125 */             JOptionPane.showMessageDialog(this.parent, "Mis à jour avec succés", "ajout", 1);
/*     */           else
/* 127 */             JOptionPane.showMessageDialog(this.parent, "Erreur lors de la mise à jour du taux d'essuyage", "Erreur", 0);
/*     */         }
/*     */       }
/*     */     });
/* 133 */     centre_appro.addActionListener(new ActionListener()
/*     */     {
/*     */       private Component parent;
/*     */ 
/*     */       public void actionPerformed(ActionEvent e) {
/* 138 */         modele.select_appro();
/* 139 */         String result = (String)JOptionPane.showInputDialog(this.parent, "entrez coefficient approvisionnement", "centre approvisionement", 3, null, null, modele.getTaux());
/*     */ 
/* 141 */         if (result != null)
/*     */         {
/* 143 */           int ret = modele.maj_appro(result);
/* 144 */           if (ret == 1)
/* 145 */             JOptionPane.showMessageDialog(this.parent, "Mis à jour avec succés", "ajout", 1);
/*     */           else
/* 147 */             JOptionPane.showMessageDialog(this.parent, "Erreur lors de la mise à jour du centre d'approvisionnemnt", "Erreur", 0);
/*     */         }
/*     */       }
/*     */     });
/* 153 */     coeff_mavet.addActionListener(new ActionListener()
/*     */     {
/*     */       private Component parent;
/*     */ 
/*     */       public void actionPerformed(ActionEvent e)
/*     */       {
/*     */         try
/*     */         {
/* 161 */           modele.select_coeff();
/* 162 */           String result = (String)JOptionPane.showInputDialog(this.parent, "entrez le coefficient comptable", "coefficient Comptable", 3, null, null, modele.getTaux());
/*     */ 
/* 164 */           if (result != null)
/*     */           {
/* 166 */             int ret = modele.maj_coeff(result);
/* 167 */             if (ret == 1)
/* 168 */               JOptionPane.showMessageDialog(this.parent, "Mis à jour avec succés", "ajout", 1);
/*     */             else {
/* 170 */               JOptionPane.showMessageDialog(this.parent, "Erreur lors de la mise à jour du coefficient comptable", "erreur", 0);
/*     */             }
/*     */           }
/*     */         }
/*     */         catch (Exception exe)
/*     */         {
/* 176 */           exe.printStackTrace();
/*     */         }
/*     */       }
/*     */     });
/* 184 */     String format = "dd/MM/yy";
/* 185 */     SimpleDateFormat formater = new SimpleDateFormat(format);
/* 186 */     Date date = new Date();
/* 187 */     String Date = formater.format(date);
/* 188 */     JLabel bas = new JLabel("Directeur - " + Date);
/* 189 */     bas.setHorizontalAlignment(4);
/* 190 */     connex.add(bas);
/*     */ 
/* 193 */     setLocationRelativeTo(null);
/* 194 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void arret()
/*     */   {
/* 200 */     dispose();
/* 201 */     setVisible(false);
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.Menu_vue_directeur
 * JD-Core Version:    0.6.2
 */