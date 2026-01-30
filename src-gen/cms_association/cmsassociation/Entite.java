/**
 */
package cms_association.cmsassociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Entite#getId <em>Id</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Entite#isActif <em>Actif</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getEntite()
 * @model abstract="true"
 * @generated
 */
public interface Entite extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getEntite_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Entite#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actif</em>' attribute.
	 * @see #setActif(boolean)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getEntite_Actif()
	 * @model required="true"
	 * @generated
	 */
	boolean isActif();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Entite#isActif <em>Actif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actif</em>' attribute.
	 * @see #isActif()
	 * @generated
	 */
	void setActif(boolean value);

} // Entite
