/**
 */
package cms_association.cmsassociation;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Article#getResume <em>Resume</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Article#getDatePublication <em>Date Publication</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Article#getContenu <em>Contenu</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Article#getAuteur <em>Auteur</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends ContenuCMS {
	/**
	 * Returns the value of the '<em><b>Resume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume</em>' attribute.
	 * @see #setResume(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getArticle_Resume()
	 * @model
	 * @generated
	 */
	String getResume();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Article#getResume <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume</em>' attribute.
	 * @see #getResume()
	 * @generated
	 */
	void setResume(String value);

	/**
	 * Returns the value of the '<em><b>Date Publication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Publication</em>' attribute.
	 * @see #setDatePublication(Date)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getArticle_DatePublication()
	 * @model required="true"
	 * @generated
	 */
	Date getDatePublication();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Article#getDatePublication <em>Date Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Publication</em>' attribute.
	 * @see #getDatePublication()
	 * @generated
	 */
	void setDatePublication(Date value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getArticle_Contenu()
	 * @model required="true"
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Article#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

	/**
	 * Returns the value of the '<em><b>Auteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auteur</em>' reference.
	 * @see #setAuteur(Utilisateur)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getArticle_Auteur()
	 * @model
	 * @generated
	 */
	Utilisateur getAuteur();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Article#getAuteur <em>Auteur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auteur</em>' reference.
	 * @see #getAuteur()
	 * @generated
	 */
	void setAuteur(Utilisateur value);

} // Article
