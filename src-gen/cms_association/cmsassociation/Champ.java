/**
 */
package cms_association.cmsassociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Champ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Champ#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Champ#getType <em>Type</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Champ#isObligatoire <em>Obligatoire</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getChamp()
 * @model
 * @generated
 */
public interface Champ extends Entite {
	/**
	 * Returns the value of the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle</em>' attribute.
	 * @see #setLibelle(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getChamp_Libelle()
	 * @model required="true"
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Champ#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cms_association.cmsassociation.ChampType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cms_association.cmsassociation.ChampType
	 * @see #setType(ChampType)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getChamp_Type()
	 * @model required="true"
	 * @generated
	 */
	ChampType getType();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Champ#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cms_association.cmsassociation.ChampType
	 * @see #getType()
	 * @generated
	 */
	void setType(ChampType value);

	/**
	 * Returns the value of the '<em><b>Obligatoire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligatoire</em>' attribute.
	 * @see #setObligatoire(boolean)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getChamp_Obligatoire()
	 * @model required="true"
	 * @generated
	 */
	boolean isObligatoire();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Champ#isObligatoire <em>Obligatoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligatoire</em>' attribute.
	 * @see #isObligatoire()
	 * @generated
	 */
	void setObligatoire(boolean value);

} // Champ
