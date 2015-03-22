/*    */ package Modele;
/*    */ 
/*    */ import bd.BDD;
/*    */ import java.util.Observable;
/*    */ 
/*    */ public class MP_ajouter_modele extends Observable
/*    */ {
/*  9 */   BDD bd = null;
/*    */ 
/*    */   public MP_ajouter_modele(BDD bdd) {
/* 12 */     this.bd = bdd;
/*    */   }
/*    */ 
/*    */   public int ajouter_mp(String code, String des, String unit, String Pu)
/*    */   {
/* 17 */     int res = this.bd.ajout_mp(code, des, unit, Pu);
/* 18 */     if (res == 1) {
/* 19 */       return 1;
/*    */     }
/*    */ 
/* 22 */     return 0;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.MP_ajouter_modele
 * JD-Core Version:    0.6.2
 */