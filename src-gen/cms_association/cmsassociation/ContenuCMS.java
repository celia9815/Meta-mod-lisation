/**
 */
package cms_association.cmsassociation;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenu CMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.ContenuCMS#getTitre <em>Titre</em>}</li>
 *   <li>{@link cms_association.cmsassociation.ContenuCMS#isPublie <em>Publie</em>}</li>
 *   <li>{@link cms_association.cmsassociation.ContenuCMS#getDateCreation <em>Date Creation</em>}</li>
 *   <li>{@link cms_association.cmsassociation.ContenuCMS#getDateModification <em>Date Modification</em>}</li>
 *   <li>{@link cms_association.cmsassociation.ContenuCMS#getSlug <em>Slug</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getContenuCMS()
 * @model abstract="true"
 * @generated
 */
public interface ContenuCMS extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getContenuCMS_Titre()
	 * @model required="true"
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.ContenuCMS#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Publie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publie</em>' attribute.
	 * @see #setPublie(boolean)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getContenuCMS_Publie()
	 * @model required="true"
	 * @generated
	 */
	boolean isPublie();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.ContenuCMS#isPublie <em>Publie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publie</em>' attribute.
	 * @see #isPublie()
	 * @generated
	 */
	void setPublie(boolean value);

	/**
	 * Returns the value of the '<em><b>Date Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Creation</em>' attribute.
	 * @see #setDateCreation(Date)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getContenuCMS_DateCreation()
	 * @model required="true"
	 * @generated
	 */
	Date getDateCreation();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.ContenuCMS#getDateCreation <em>Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Creation</em>' attribute.
	 * @see #getDateCreation()
	 * @generated
	 */
	void setDateCreation(Date value);

	/**
	 * Returns the value of the '<em><b>Date Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Modification</em>' attribute.
	 * @see #setDateModification(Date)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getContenuCMS_DateModification()
	 * @model
	 * @generated
	 */
	Date getDateModification();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.ContenuCMS#getDateModification <em>Date Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Modification</em>' attribute.
	 * @see #getDateModification()
	 * @generated
	 */
	void setDateModification(Date value);

	/**
	 * Returns the value of the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slug</em>' attribute.
	 * @see #setSlug(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getContenuCMS_Slug()
	 * @model required="true"
	 * @generated
	 */
	String getSlug();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.ContenuCMS#getSlug <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slug</em>' attribute.
	 * @see #getSlug()
	 * @generated
	 */
	void setSlug(String value);

} // ContenuCMS
