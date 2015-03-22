/*    */ package COntroleur;
/*    */ 
/*    */ import Modele.Connexion_modele;
/*    */ import Vue.Connexion_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.awt.event.KeyEvent;
/*    */ import java.awt.event.KeyListener;
/*    */ import javax.swing.JPasswordField;
/*    */ import javax.swing.JTextField;
/*    */ import main.Menu_main;
/*    */ 
/*    */ public class Connexion_controleur
/*    */   implements ActionListener, KeyListener
/*    */ {
/*    */   Connexion_modele modele;
/*    */   Connexion_vue vue;
/*    */   BDD bdd;
/*    */ 
/*    */   public Connexion_controleur(Connexion_modele modele, Connexion_vue vue, BDD bdd)
/*    */   {
/* 21 */     this.modele = modele;
/* 22 */     this.vue = vue;
/* 23 */     this.bdd = bdd;
/*    */   }
/*    */ 
/*    */   public void creer_connexion_bdd()
/*    */   {
/* 28 */     String adresse = this.vue.getAdresseIP().getText();
/* 29 */     String port = this.vue.getPort().getText();
/* 30 */     String pseudo = this.vue.getPseudo().getText();
/* 31 */     String pass = new String(this.vue.getPass().getPassword());
/* 32 */     int test = this.modele.connexion_bdd(adresse, port, pseudo, pass);
/* 33 */     if (test > 0) {
/* 34 */       this.vue.setVisible(false);
/* 35 */       Menu_main localMenu_main = new Menu_main(this.bdd);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent e)
/*    */   {
/* 42 */     if (e.getSource() == this.vue.valider) {
/* 43 */       creer_connexion_bdd();
/* 44 */     } else if (e.getSource() == this.vue.retour) {
/* 45 */       this.vue.dispose();
/* 46 */       System.exit(0);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void keyPressed(KeyEvent e)
/*    */   {
/* 56 */     if (e.getKeyCode() == 10)
/* 57 */       creer_connexion_bdd();
/*    */   }
/*    */ 
/*    */   public void keyReleased(KeyEvent arg0)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void keyTyped(KeyEvent arg0)
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.Connexion_controleur
 * JD-Core Version:    0.6.2
 */