/**
 */
package cms_association.cmsassociation;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demande</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.Demande#getReference <em>Reference</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Demande#getDatePlanifiee <em>Date Planifiee</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Demande#getDescription <em>Description</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Demande#getFormulaire <em>Formulaire</em>}</li>
 *   <li>{@link cms_association.cmsassociation.Demande#getReponses <em>Reponses</em>}</li>
 * </ul>
 *
 * @see cms_association.cmsassociation.CmsassociationPackage#getDemande()
 * @model
 * @generated
 */
public interface Demande extends Entite {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getDemande_Reference()
	 * @model required="true"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Demande#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Date Planifiee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Planifiee</em>' attribute.
	 * @see #setDatePlanifiee(Date)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getDemande_DatePlanifiee()
	 * @model
	 * @generated
	 */
	Date getDatePlanifiee();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Demande#getDatePlanifiee <em>Date Planifiee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Planifiee</em>' attribute.
	 * @see #getDatePlanifiee()
	 * @generated
	 */
	void setDatePlanifiee(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getDemande_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Demande#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Formulaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulaire</em>' reference.
	 * @see #setFormulaire(Formulaire)
	 * @see cms_association.cmsassociation.CmsassociationPackage#getDemande_Formulaire()
	 * @model required="true"
	 * @generated
	 */
	Formulaire getFormulaire();

	/**
	 * Sets the value of the '{@link cms_association.cmsassociation.Demande#getFormulaire <em>Formulaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formulaire</em>' reference.
	 * @see #getFormulaire()
	 * @generated
	 */
	void setFormulaire(Formulaire value);

	/**
	 * Returns the value of the '<em><b>Reponses</b></em>' containment reference list.
	 * The list contents are of type {@link cms_association.cmsassociation.Reponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponses</em>' containment reference list.
	 * @see cms_association.cmsassociation.CmsassociationPackage#getDemande_Reponses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reponse> getReponses();

} // Demande
