/*    */ package COntroleur;
/*    */ 
/*    */ import Modele.Menu_Modele;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintStream;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.swing.JFileChooser;
/*    */ import javax.swing.JOptionPane;
/*    */ import main.IMenu_vue;
/*    */ import main.MP_main;
/*    */ import main.UO_main;
/*    */ import main.creer_fiche_main;
/*    */ import main.modifier_fiche_main;
/*    */ import net.sf.jasperreports.engine.JRException;
/*    */ import net.sf.jasperreports.engine.JasperCompileManager;
/*    */ import net.sf.jasperreports.engine.JasperFillManager;
/*    */ import net.sf.jasperreports.engine.JasperPrint;
/*    */ import net.sf.jasperreports.engine.JasperReport;
/*    */ import net.sf.jasperreports.engine.design.JasperDesign;
/*    */ import net.sf.jasperreports.engine.xml.JRXmlLoader;
/*    */ import net.sf.jasperreports.view.JasperViewer;
/*    */ 
/*    */ public class Menu_controleur
/*    */   implements ActionListener
/*    */ {
/*    */   IMenu_vue vue;
/*    */   Menu_Modele modele;
/*    */   BDD bdd;
/*    */ 
/*    */   public Menu_controleur(Menu_Modele modele, IMenu_vue vue, BDD bdd)
/*    */   {
/* 34 */     this.vue = vue;
/* 35 */     this.bdd = bdd;
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent e)
/*    */   {
/*    */     String result;
/* 40 */     if (e.getSource() == IMenu_vue.consulter) {
/* 41 */       System.out.println(this.bdd.indice);
/* 42 */       System.out.println("consulter");
/* 43 */       result = JOptionPane.showInputDialog(null, "entrez le code produit", "Consulter", 3);
/*    */ 
/* 45 */       if (result != null)
/*    */       {
/* 47 */         System.out.println(result);
/*    */         try
/*    */         {
/* 50 */           JasperDesign jasperDesign = JRXmlLoader.load("C:\\prix_revient\\formulaire\\report6.jrxml");
/* 51 */           JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
/*    */ 
/* 54 */           Map parameters = new HashMap();
/* 55 */           parameters.put("ref", result);
/*    */ 
/* 58 */           JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, this.bdd.getConn());
/*    */ 
/* 60 */           JasperViewer.viewReport(jasperPrint, false);
/*    */         } catch (JRException ex) {
/* 62 */           JOptionPane.showMessageDialog(null, ex.getMessage(), "erreur", 0);
/*    */         }
/*    */       }
/*    */ 
/*    */     }
/* 67 */     else if (e.getSource() == IMenu_vue.retour) {
/* 68 */       this.vue.arret();
/*    */     }
/* 70 */     else if (e.getSource() == IMenu_vue.MP)
/*    */     {
/* 72 */       new MP_main(this.bdd);
/*    */     }
/* 74 */     else if (e.getSource() == IMenu_vue.UO)
/*    */     {
/* 76 */      new UO_main(this.bdd);
/*    */     }
/* 78 */     else if (e.getSource() == IMenu_vue.creer_fiche)
/*    */     {
/* 80 */       new creer_fiche_main(this.bdd);
/*    */     }
/* 82 */     else if (e.getSource() == IMenu_vue.modifier_fiche)
/*    */     {
/* 84 */       new modifier_fiche_main(this.bdd);
/*    */     }
/* 86 */     else if (e.getSource() == IMenu_vue.sauvegarder) {
/*    */       try {
/* 88 */         String format = "dd_MM_yy";
/* 89 */         SimpleDateFormat formater = new SimpleDateFormat(format);
/* 90 */         Date date = new Date();
/* 91 */         String Date = formater.format(date);
/* 92 */         Runtime.getRuntime().exec("cmd.exe /c start F:\\EMMANUEL\\prix_revient\\bin\\pg_dump.exe --host " + this.bdd.getAddress() + " --port " + this.bdd.getPort() + " --username postgres --file F:\\EMMANUEL\\prix_revient\\sauvegarde\\prix_revient_" + Date + ".sql Stellinox ");
/*    */       } catch (IOException e1) {
/* 94 */         JOptionPane.showMessageDialog(null, e1.getMessage(), "erreur", 0);
/*    */       }
/* 96 */     } else if (e.getSource() == IMenu_vue.charger) {
/* 97 */       JFileChooser save = new JFileChooser();
/* 98 */       int retour = save.showOpenDialog(null);
/* 99 */       if (retour == 0)
/*    */         try
/*    */         {
/* 102 */           Runtime.getRuntime().exec("cmd.exe /c start F:\\EMMANUEL\\prix_revient\\bin\\psql.exe --host " + this.bdd.getAddress() + " --port 5432 --username postgres --file " + save.getSelectedFile().getAbsolutePath() + " Stellinox ");
/*    */         } catch (IOException e1) {
/* 104 */           JOptionPane.showMessageDialog(null, e1.getMessage(), "erreur", 0);
/*    */         }
/*    */     }
/* 107 */     else if (e.getSource() == IMenu_vue.liste)
/*    */     {
/*    */       try {
/* 110 */         JasperDesign jasperDesign = JRXmlLoader.load("C:\\prix_revient\\formulaire\\report2.jrxml");
/* 111 */         JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
/*    */ 
/* 114 */         JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, this.bdd.getConn());
/*    */ 
/* 116 */         JasperViewer.viewReport(jasperPrint, false);
/*    */       } catch (JRException ex) {
/* 118 */         JOptionPane.showMessageDialog(null, ex.getMessage(), "erreur", 0);
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.Menu_controleur
 * JD-Core Version:    0.6.2
 */