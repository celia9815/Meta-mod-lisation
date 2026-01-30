/**
 */
package cms_association.cmsassociation.impl;

import cms_association.cmsassociation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmsassociationFactoryImpl extends EFactoryImpl implements CmsassociationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmsassociationFactory init() {
		try {
			CmsassociationFactory theCmsassociationFactory = (CmsassociationFactory) EPackage.Registry.INSTANCE
					.getEFactory(CmsassociationPackage.eNS_URI);
			if (theCmsassociationFactory != null) {
				return theCmsassociationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CmsassociationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsassociationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CmsassociationPackage.ASSOCIATION:
			return createAssociation();
		case CmsassociationPackage.UTILISATEUR:
			return createUtilisateur();
		case CmsassociationPackage.ROLE:
			return createRole();
		case CmsassociationPackage.FORMULAIRE:
			return createFormulaire();
		case CmsassociationPackage.CHAMP:
			return createChamp();
		case CmsassociationPackage.DEMANDE:
			return createDemande();
		case CmsassociationPackage.PLATEFORME:
			return createPlateforme();
		case CmsassociationPackage.REPONSE:
			return createReponse();
		case CmsassociationPackage.PAGE:
			return createPage();
		case CmsassociationPackage.ARTICLE:
			return createArticle();
		case CmsassociationPackage.MEDIA:
			return createMedia();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CmsassociationPackage.CHAMP_TYPE:
			return createChampTypeFromString(eDataType, initialValue);
		case CmsassociationPackage.MEDIA_TYPE:
			return createMediaTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CmsassociationPackage.CHAMP_TYPE:
			return convertChampTypeToString(eDataType, instanceValue);
		case CmsassociationPackage.MEDIA_TYPE:
			return convertMediaTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateur createUtilisateur() {
		UtilisateurImpl utilisateur = new UtilisateurImpl();
		return utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formulaire createFormulaire() {
		FormulaireImpl formulaire = new FormulaireImpl();
		return formulaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Champ createChamp() {
		ChampImpl champ = new ChampImpl();
		return champ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Demande createDemande() {
		DemandeImpl demande = new DemandeImpl();
		return demande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plateforme createPlateforme() {
		PlateformeImpl plateforme = new PlateformeImpl();
		return plateforme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reponse createReponse() {
		ReponseImpl reponse = new ReponseImpl();
		return reponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChampType createChampTypeFromString(EDataType eDataType, String initialValue) {
		ChampType result = ChampType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChampTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmsassociationPackage getCmsassociationPackage() {
		return (CmsassociationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CmsassociationPackage getPackage() {
		return CmsassociationPackage.eINSTANCE;
	}

} //CmsassociationFactoryImpl
