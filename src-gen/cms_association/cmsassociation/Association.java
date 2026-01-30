/**
 */
package cms_association.cmsassociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Association#getEmail <em>Email</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getNom <em>Nom</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getNumTel <em>Num Tel</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getFormulaires <em>Formulaires</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getDemandes <em>Demandes</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getUtilisateurs <em>Utilisateurs</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getRoles <em>Roles</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getPages <em>Pages</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getArticles <em>Articles</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Association#getMedias <em>Medias</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Entite {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Association#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Association#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Num Tel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Tel</em>' attribute.
	 * @see #setNumTel(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_NumTel()
	 * @model
	 * @generated
	 */
	String getNumTel();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Association#getNumTel <em>Num Tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Tel</em>' attribute.
	 * @see #getNumTel()
	 * @generated
	 */
	void setNumTel(String value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Association#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Formulaires</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Formulaire}.
	 * It is bidirectional and its opposite is '{@link cms_association.cmsassociation.Formulaire#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulaires</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Formulaires()
	 * @see cms_association.cmsassociation.Formulaire#getAssociation
	 * @model opposite="association" containment="true"
	 * @generated
	 */
	EList<Formulaire> getFormulaires();

	/**
	 * Returns the value of the '<em><b>Demandes</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Demande}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demandes</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Demandes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Demande> getDemandes();

	/**
	 * Returns the value of the '<em><b>Utilisateurs</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Utilisateur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisateurs</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Utilisateurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Utilisateur> getUtilisateurs();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Article}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Articles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Article> getArticles();

	/**
	 * Returns the value of the '<em><b>Medias</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Media}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medias</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getAssociation_Medias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Media> getMedias();

} // Association
