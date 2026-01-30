/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.CmsassociationPackage;
import cms_association.cmsassociation.Entite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.EntiteImpl#getId <em>Id</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.EntiteImpl#isActif <em>Actif</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntiteImpl extends MinimalEObjectImpl.Container implements Entite {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isActif() <em>Actif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActif()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActif() <em>Actif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActif()
	 * @generated
	 * @ordered
	 */
	protected boolean actif = ACTIF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.ENTITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ENTITE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActif() {
		return actif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActif(boolean newActif) {
		boolean oldActif = actif;
		actif = newActif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.ENTITE__ACTIF, oldActif,
					actif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.ENTITE__ID:
			return getId();
		case CmsassociationPackage.ENTITE__ACTIF:
			return isActif();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CmsassociationPackage.ENTITE__ID:
			setId((Integer) newValue);
			return;
		case CmsassociationPackage.ENTITE__ACTIF:
			setActif((Boolean) newValue);
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
		case CmsassociationPackage.ENTITE__ID:
			setId(ID_EDEFAULT);
			return;
		case CmsassociationPackage.ENTITE__ACTIF:
			setActif(ACTIF_EDEFAULT);
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
		case CmsassociationPackage.ENTITE__ID:
			return id != ID_EDEFAULT;
		case CmsassociationPackage.ENTITE__ACTIF:
			return actif != ACTIF_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", actif: ");
		result.append(actif);
		result.append(')');
		return result.toString();
	}

} //EntiteImpl
