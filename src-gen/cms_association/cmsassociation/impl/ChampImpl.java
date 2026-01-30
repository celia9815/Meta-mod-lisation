/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.Champ;
import cms_association.cmsassociation.ChampType;
import cms_association.cmsassociation.CmsassociationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Champ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cms_association.cmsassociation.impl.ChampImpl#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ChampImpl#getType <em>Type</em>}</li>
 *   <li>{@link cms_association.cmsassociation.impl.ChampImpl#isObligatoire <em>Obligatoire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChampImpl extends EntiteImpl implements Champ {
	/**
	 * The default value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected String libelle = LIBELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ChampType TYPE_EDEFAULT = ChampType.TEXTAREA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ChampType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isObligatoire() <em>Obligatoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatoire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBLIGATOIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObligatoire() <em>Obligatoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatoire()
	 * @generated
	 * @ordered
	 */
	protected boolean obligatoire = OBLIGATOIRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CmsassociationPackage.Literals.CHAMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelle(String newLibelle) {
		String oldLibelle = libelle;
		libelle = newLibelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.CHAMP__LIBELLE, oldLibelle,
					libelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChampType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ChampType newType) {
		ChampType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.CHAMP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObligatoire() {
		return obligatoire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligatoire(boolean newObligatoire) {
		boolean oldObligatoire = obligatoire;
		obligatoire = newObligatoire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CmsassociationPackage.CHAMP__OBLIGATOIRE,
					oldObligatoire, obligatoire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CmsassociationPackage.CHAMP__LIBELLE:
			return getLibelle();
		case CmsassociationPackage.CHAMP__TYPE:
			return getType();
		case CmsassociationPackage.CHAMP__OBLIGATOIRE:
			return isObligatoire();
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
		case CmsassociationPackage.CHAMP__LIBELLE:
			setLibelle((String) newValue);
			return;
		case CmsassociationPackage.CHAMP__TYPE:
			setType((ChampType) newValue);
			return;
		case CmsassociationPackage.CHAMP__OBLIGATOIRE:
			setObligatoire((Boolean) newValue);
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
		case CmsassociationPackage.CHAMP__LIBELLE:
			setLibelle(LIBELLE_EDEFAULT);
			return;
		case CmsassociationPackage.CHAMP__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case CmsassociationPackage.CHAMP__OBLIGATOIRE:
			setObligatoire(OBLIGATOIRE_EDEFAULT);
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
		case CmsassociationPackage.CHAMP__LIBELLE:
			return LIBELLE_EDEFAULT == null ? libelle != null : !LIBELLE_EDEFAULT.equals(libelle);
		case CmsassociationPackage.CHAMP__TYPE:
			return type != TYPE_EDEFAULT;
		case CmsassociationPackage.CHAMP__OBLIGATOIRE:
			return obligatoire != OBLIGATOIRE_EDEFAULT;
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
		result.append(" (libelle: ");
		result.append(libelle);
		result.append(", type: ");
		result.append(type);
		result.append(", obligatoire: ");
		result.append(obligatoire);
		result.append(')');
		return result.toString();
	}

} //ChampImpl
