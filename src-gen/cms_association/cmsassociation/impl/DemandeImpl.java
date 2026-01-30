/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.Demande;
import cms_association.cmsassociation.Formulaire;
import cms_association.cmsassociation.Reponse;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Demande</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.DemandeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.DemandeImpl#getDatePlanifiee <em>Date Planifiee</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.DemandeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.DemandeImpl#getFormulaire <em>Formulaire</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.DemandeImpl#getReponses <em>Reponses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemandeImpl extends EntiteImpl implements Demande {
	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatePlanifiee() <em>Date Planifiee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePlanifiee()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PLANIFIEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePlanifiee() <em>Date Planifiee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePlanifiee()
	 * @generated
	 * @ordered
	 */
	protected Date datePlanifiee = DATE_PLANIFIEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormulaire() <em>Formulaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulaire()
	 * @generated
	 * @ordered
	 */
	protected Formulaire formulaire;

	/**
	 * The cached value of the '{@link #getReponses() <em>Reponses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponses()
	 * @generated
	 * @ordered
	 */
	protected EList<Reponse> reponses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemandeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.DEMANDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.DEMANDE__REFERENCE,
					oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatePlanifiee() {
		return datePlanifiee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePlanifiee(Date newDatePlanifiee) {
		Date oldDatePlanifiee = datePlanifiee;
		datePlanifiee = newDatePlanifiee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.DEMANDE__DATE_PLANIFIEE,
					oldDatePlanifiee, datePlanifiee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.DEMANDE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formulaire getFormulaire() {
		if (formulaire != null && formulaire.eIsProxy()) {
			InternalEObject oldFormulaire = (InternalEObject) formulaire;
			formulaire = (Formulaire) eResolveProxy(oldFormulaire);
			if (formulaire != oldFormulaire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CmsassociationPackage.DEMANDE__FORMULAIRE,
							oldFormulaire, formulaire));
			}
		}
		return formulaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formulaire basicGetFormulaire() {
		return formulaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormulaire(Formulaire newFormulaire) {
		Formulaire oldFormulaire = formulaire;
		formulaire = newFormulaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.DEMANDE__FORMULAIRE,
					oldFormulaire, formulaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reponse> getReponses() {
		if (reponses == null) {
			reponses = new EObjectContainmentEList<Reponse>(Reponse.class, this,
					CmsassociationPackage.DEMANDE__REPONSES);
		}
		return reponses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsassociationPackage.DEMANDE__REPONSES:
			return ((InternalEList<?>) getReponses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.DEMANDE__REFERENCE:
			return getReference();
		case CmsassociationPackage.DEMANDE__DATE_PLANIFIEE:
			return getDatePlanifiee();
		case CmsassociationPackage.DEMANDE__DESCRIPTION:
			return getDescription();
		case CmsassociationPackage.DEMANDE__FORMULAIRE:
			if (resolve)
				return getFormulaire();
			return basicGetFormulaire();
		case CmsassociationPackage.DEMANDE__REPONSES:
			return getReponses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsassociationPackage.DEMANDE__REFERENCE:
			setReference((String) newValue);
			return;
		case CmsassociationPackage.DEMANDE__DATE_PLANIFIEE:
			setDatePlanifiee((Date) newValue);
			return;
		case CmsassociationPackage.DEMANDE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CmsassociationPackage.DEMANDE__FORMULAIRE:
			setFormulaire((Formulaire) newValue);
			return;
		case CmsassociationPackage.DEMANDE__REPONSES:
			getReponses().clear();
			getReponses().addAll((Collection<? extends Reponse>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CmsassociationPackage.DEMANDE__REFERENCE:
			setReference(REFERENCE_EDEFAULT);
			return;
		case CmsassociationPackage.DEMANDE__DATE_PLANIFIEE:
			setDatePlanifiee(DATE_PLANIFIEE_EDEFAULT);
			return;
		case CmsassociationPackage.DEMANDE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CmsassociationPackage.DEMANDE__FORMULAIRE:
			setFormulaire((Formulaire) null);
			return;
		case CmsassociationPackage.DEMANDE__REPONSES:
			getReponses().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CmsassociationPackage.DEMANDE__REFERENCE:
			return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
		case CmsassociationPackage.DEMANDE__DATE_PLANIFIEE:
			return DATE_PLANIFIEE_EDEFAULT == null ? datePlanifiee != null
					: !DATE_PLANIFIEE_EDEFAULT.equals(datePlanifiee);
		case CmsassociationPackage.DEMANDE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CmsassociationPackage.DEMANDE__FORMULAIRE:
			return formulaire != null;
		case CmsassociationPackage.DEMANDE__REPONSES:
			return reponses != null && !reponses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (reference: ");
		result.append(reference);
		result.append(", datePlanifiee: ");
		result.append(datePlanifiee);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DemandeImpl
