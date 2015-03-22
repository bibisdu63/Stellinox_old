/*    */ package Modele;
/*    */ 
/*    */ import bd.BDD;
/*    */ import java.util.Observable;
/*    */ 
/*    */ public class creer_fiche_modele extends Observable
/*    */ {
/*  9 */   BDD bd = null;
/*    */ 
/*    */   public creer_fiche_modele(BDD bdd) {
/* 12 */     this.bd = bdd;
/*    */   }
/*    */ 
/*    */   public int creer_fiche(String code, String des) {
/* 16 */     int res = this.bd.creer_fiche(code, des);
/* 17 */     if (res == 1) {
/* 18 */       return 1;
/*    */     }
/*    */ 
/* 21 */     return 0;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.creer_fiche_modele
 * JD-Core Version:    0.6.2
 */