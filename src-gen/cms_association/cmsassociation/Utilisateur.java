/**
 */
package cms_association.cmsassociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilisateur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Utilisateur#getEmail <em>Email</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Utilisateur#getNomComplet <em>Nom Complet</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Utilisateur#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getUtilisateur()
 * @model
 * @generated
 */
public interface Utilisateur extends Entite {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getUtilisateur_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Utilisateur#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Nom Complet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Complet</em>' attribute.
	 * @see #setNomComplet(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getUtilisateur_NomComplet()
	 * @model required="true"
	 * @generated
	 */
	String getNomComplet();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Utilisateur#getNomComplet <em>Nom Complet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Complet</em>' attribute.
	 * @see #getNomComplet()
	 * @generated
	 */
	void setNomComplet(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getUtilisateur_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Utilisateur#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // Utilisateur
