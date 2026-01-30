/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.Association;
import cms_association.cmsassociation.Champ;
import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.Formulaire;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formulaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.FormulaireImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.FormulaireImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.FormulaireImpl#getChamps <em>Champs</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.FormulaireImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaireImpl extends EntiteImpl implements Formulaire {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
	 * The cached value of the '{@link #getChamps() <em>Champs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChamps()
	 * @generated
	 * @ordered
	 */
	protected EList<Champ> champs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.FORMULAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.FORMULAIRE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.FORMULAIRE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Champ> getChamps() {
		if (champs == null) {
			champs = new EObjectContainmentEList<Champ>(Champ.class, this, CmsassociationPackage.FORMULAIRE__CHAMPS);
		}
		return champs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (eContainerFeatureID() != CmsassociationPackage.FORMULAIRE__ASSOCIATION)
			return null;
		return (Association) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAssociation, CmsassociationPackage.FORMULAIRE__ASSOCIATION,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		if (newAssociation != eInternalContainer()
				|| (eContainerFeatureID() != CmsassociationPackage.FORMULAIRE__ASSOCIATION && newAssociation != null)) {
			if (EcoreUtil.isAncestor(this, newAssociation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject) newAssociation).eInverseAdd(this,
						CmsassociationPackage.ASSOCIATION__FORMULAIRES, Association.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.FORMULAIRE__ASSOCIATION,
					newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsassociationPackage.FORMULAIRE__ASSOCIATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAssociation((Association) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CmsassociationPackage.FORMULAIRE__CHAMPS:
			return ((InternalEList<?>) getChamps()).basicRemove(otherEnd, msgs);
		case CmsassociationPackage.FORMULAIRE__ASSOCIATION:
			return basicSetAssociation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CmsassociationPackage.FORMULAIRE__ASSOCIATION:
			return eInternalContainer().eInverseRemove(this, CmsassociationPackage.ASSOCIATION__FORMULAIRES,
					Association.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.FORMULAIRE__NOM:
			return getNom();
		case CmsassociationPackage.FORMULAIRE__DESCRIPTION:
			return getDescription();
		case CmsassociationPackage.FORMULAIRE__CHAMPS:
			return getChamps();
		case CmsassociationPackage.FORMULAIRE__ASSOCIATION:
			return getAssociation();
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
		case CmsassociationPackage.FORMULAIRE__NOM:
			setNom((String) newValue);
			return;
		case CmsassociationPackage.FORMULAIRE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CmsassociationPackage.FORMULAIRE__CHAMPS:
			getChamps().clear();
			getChamps().addAll((Collection<? extends Champ>) newValue);
			return;
		case CmsassociationPackage.FORMULAIRE__ASSOCIATION:
			setAssociation((Association) newValue);
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
		case CmsassociationPackage.FORMULAIRE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case CmsassociationPackage.FORMULAIRE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CmsassociationPackage.FORMULAIRE__CHAMPS:
			getChamps().clear();
			return;
		case CmsassociationPackage.FORMULAIRE__ASSOCIATION:
			setAssociation((Association) null);
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
		case CmsassociationPackage.FORMULAIRE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case CmsassociationPackage.FORMULAIRE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CmsassociationPackage.FORMULAIRE__CHAMPS:
			return champs != null && !champs.isEmpty();
		case CmsassociationPackage.FORMULAIRE__ASSOCIATION:
			return getAssociation() != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //FormulaireImpl
