/**
 */
package cms_association.cmsassociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Reponse#getValeur <em>Valeur</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Reponse#getChamp <em>Champ</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getReponse()
 * @model
 * @generated
 */
public interface Reponse extends Entite {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getReponse_Valeur()
	 * @model
	 * @generated
	 */
	String getValeur();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Reponse#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(String value);

	/**
	 * Returns the value of the '<em><b>Champ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champ</em>' reference.
	 * @see #setChamp(Champ)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getReponse_Champ()
	 * @model required="true"
	 * @generated
	 */
	Champ getChamp();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Reponse#getChamp <em>Champ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Champ</em>' reference.
	 * @see #getChamp()
	 * @generated
	 */
	void setChamp(Champ value);

} // Reponse
