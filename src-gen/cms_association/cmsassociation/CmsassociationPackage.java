/**
 */
package cms_association.cmsassociation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cms_association.cmsassociation.CmsassociationFactory
 * @model kind="package"
 * @generated
 */
public interface CmsassociationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cmsassociation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.ubo.mde.meddous.cmsassociation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cmsassociation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CmsassociationPackage eINSTANCE = cms_association.cmsassociation.impl.CmsassociationPackageImpl.init();

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.EntiteImpl <em>Entite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.EntiteImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getEntite()
	 * @generated
	 */
	int ENTITE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITE__ID = 0;

	/**
	 * The feature id for the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITE__ACTIF = 1;

	/**
	 * The number of structural features of the '<em>Entite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.AssociationImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ID = ENTITE__ID;

	/**
	 * The feature id for the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ACTIF = ENTITE__ACTIF;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__EMAIL = ENTITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NOM = ENTITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Num Tel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NUM_TEL = ENTITE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ADRESSE = ENTITE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Formulaires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FORMULAIRES = ENTITE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Demandes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DEMANDES = ENTITE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Utilisateurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__UTILISATEURS = ENTITE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ROLES = ENTITE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PAGES = ENTITE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ARTICLES = ENTITE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Medias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEDIAS = ENTITE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = ENTITE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = ENTITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.UtilisateurImpl <em>Utilisateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.UtilisateurImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getUtilisateur()
	 * @generated
	 */
	int UTILISATEUR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__ID = ENTITE__ID;

	/**
	 * The feature id for the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__ACTIF = ENTITE__ACTIF;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__EMAIL = ENTITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom Complet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__NOM_COMPLET = ENTITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__ROLE = ENTITE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_FEATURE_COUNT = ENTITE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_OPERATION_COUNT = ENTITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.RoleImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = ENTITE__ID;

	/**
	 * The feature id for the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACTIF = ENTITE__ACTIF;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NOM = ENTITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ENTITE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = ENTITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.FormulaireImpl <em>Formulaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.FormulaireImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getFormulaire()
	 * @generated
	 */
	int FORMULAIRE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__ID = ENTITE__ID;

	/**
	 * The feature id for the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__ACTIF = ENTITE__ACTIF;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__NOM = ENTITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__DESCRIPTION = ENTITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Champs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__CHAMPS = ENTITE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__ASSOCIATION = ENTITE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Formulaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE_FEATURE_COUNT = ENTITE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Formulaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE_OPERATION_COUNT = ENTITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.ChampImpl <em>Champ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.ChampImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getChamp()
	 * @generated
	 */
	int CHAMP = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP__ID = ENTITE__ID;

	/**
	 * The feature id for the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP__ACTIF = ENTITE__ACTIF;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP__LIBELLE = ENTITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP__TYPE = ENTITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obligatoire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP__OBLIGATOIRE = ENTITE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Champ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_FEATURE_COUNT = ENTITE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Champ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMP_OPERATION_COUNT = ENTITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.DemandeImpl <em>Demande</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.DemandeImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getDemande()
	 * @generated
	 */
	int DEMANDE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE__ID = ENTITE__ID;

	/**
	 * The feature id for the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE__ACTIF = ENTITE__ACTIF;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE__REFERENCE = ENTITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Planifiee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE__DATE_PLANIFIEE = ENTITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE__DESCRIPTION = ENTITE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulaire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE__FORMULAIRE = ENTITE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reponses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE__REPONSES = ENTITE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Demande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE_FEATURE_COUNT = ENTITE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Demande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMANDE_OPERATION_COUNT = ENTITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.PlateformeImpl <em>Plateforme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.PlateformeImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getPlateforme()
	 * @generated
	 */
	int PLATEFORME = 7;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEFORME__ASSOCIATIONS = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEFORME__NOM = 1;

	/**
	 * The number of structural features of the '<em>Plateforme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEFORME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plateforme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATEFORME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.ReponseImpl <em>Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.ReponseImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getReponse()
	 * @generated
	 */
	int REPONSE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__ID = ENTITE__ID;

	/**
	 * The feature id for the '<em><b>Actif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__ACTIF = ENTITE__ACTIF;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__VALEUR = ENTITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Champ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__CHAMP = ENTITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_FEATURE_COUNT = ENTITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OPERATION_COUNT = ENTITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.ContenuCMSImpl <em>Contenu CMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.ContenuCMSImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getContenuCMS()
	 * @generated
	 */
	int CONTENU_CMS = 9;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_CMS__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Publie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_CMS__PUBLIE = 1;

	/**
	 * The feature id for the '<em><b>Date Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_CMS__DATE_CREATION = 2;

	/**
	 * The feature id for the '<em><b>Date Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_CMS__DATE_MODIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_CMS__SLUG = 4;

	/**
	 * The number of structural features of the '<em>Contenu CMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_CMS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contenu CMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_CMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.PageImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 10;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITRE = CONTENU_CMS__TITRE;

	/**
	 * The feature id for the '<em><b>Publie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PUBLIE = CONTENU_CMS__PUBLIE;

	/**
	 * The feature id for the '<em><b>Date Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DATE_CREATION = CONTENU_CMS__DATE_CREATION;

	/**
	 * The feature id for the '<em><b>Date Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DATE_MODIFICATION = CONTENU_CMS__DATE_MODIFICATION;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__SLUG = CONTENU_CMS__SLUG;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTENU = CONTENU_CMS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = CONTENU_CMS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = CONTENU_CMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.ArticleImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 11;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITRE = CONTENU_CMS__TITRE;

	/**
	 * The feature id for the '<em><b>Publie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__PUBLIE = CONTENU_CMS__PUBLIE;

	/**
	 * The feature id for the '<em><b>Date Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__DATE_CREATION = CONTENU_CMS__DATE_CREATION;

	/**
	 * The feature id for the '<em><b>Date Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__DATE_MODIFICATION = CONTENU_CMS__DATE_MODIFICATION;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__SLUG = CONTENU_CMS__SLUG;

	/**
	 * The feature id for the '<em><b>Resume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__RESUME = CONTENU_CMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Publication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__DATE_PUBLICATION = CONTENU_CMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CONTENU = CONTENU_CMS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__AUTEUR = CONTENU_CMS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = CONTENU_CMS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = CONTENU_CMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.impl.MediaImpl
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 12;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__NOM = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__URL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.ChampType <em>Champ Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.ChampType
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getChampType()
	 * @generated
	 */
	int CHAMP_TYPE = 13;

	/**
	 * The meta object id for the '{@link cms_association.cmsassociation.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cms_association.cmsassociation.MediaType
	 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 14;

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Entite <em>Entite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entite</em>'.
	 * @see cms_association.cmsassociation.Entite
	 * @generated
	 */
	EClass getEntite();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Entite#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cms_association.cmsassociation.Entite#getId()
	 * @see #getEntite()
	 * @generated
	 */
	EAttribute getEntite_Id();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Entite#isActif <em>Actif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actif</em>'.
	 * @see cms_association.cmsassociation.Entite#isActif()
	 * @see #getEntite()
	 * @generated
	 */
	EAttribute getEntite_Actif();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see cms_association.cmsassociation.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Association#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see cms_association.cmsassociation.Association#getEmail()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Email();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Association#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see cms_association.cmsassociation.Association#getNom()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Nom();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Association#getNumTel <em>Num Tel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tel</em>'.
	 * @see cms_association.cmsassociation.Association#getNumTel()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_NumTel();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Association#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see cms_association.cmsassociation.Association#getAdresse()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Adresse();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Association#getFormulaires <em>Formulaires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulaires</em>'.
	 * @see cms_association.cmsassociation.Association#getFormulaires()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Formulaires();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Association#getDemandes <em>Demandes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Demandes</em>'.
	 * @see cms_association.cmsassociation.Association#getDemandes()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Demandes();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Association#getUtilisateurs <em>Utilisateurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Utilisateurs</em>'.
	 * @see cms_association.cmsassociation.Association#getUtilisateurs()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Utilisateurs();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Association#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see cms_association.cmsassociation.Association#getRoles()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Association#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see cms_association.cmsassociation.Association#getPages()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Association#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articles</em>'.
	 * @see cms_association.cmsassociation.Association#getArticles()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Articles();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Association#getMedias <em>Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medias</em>'.
	 * @see cms_association.cmsassociation.Association#getMedias()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Medias();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Utilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilisateur</em>'.
	 * @see cms_association.cmsassociation.Utilisateur
	 * @generated
	 */
	EClass getUtilisateur();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Utilisateur#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see cms_association.cmsassociation.Utilisateur#getEmail()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Email();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Utilisateur#getNomComplet <em>Nom Complet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Complet</em>'.
	 * @see cms_association.cmsassociation.Utilisateur#getNomComplet()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_NomComplet();

	/**
	 * Returns the meta object for the reference '{@link cms_association.cmsassociation.Utilisateur#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see cms_association.cmsassociation.Utilisateur#getRole()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EReference getUtilisateur_Role();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see cms_association.cmsassociation.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Role#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see cms_association.cmsassociation.Role#getNom()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Nom();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Formulaire <em>Formulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulaire</em>'.
	 * @see cms_association.cmsassociation.Formulaire
	 * @generated
	 */
	EClass getFormulaire();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Formulaire#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see cms_association.cmsassociation.Formulaire#getNom()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Nom();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Formulaire#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cms_association.cmsassociation.Formulaire#getDescription()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Formulaire#getChamps <em>Champs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Champs</em>'.
	 * @see cms_association.cmsassociation.Formulaire#getChamps()
	 * @see #getFormulaire()
	 * @generated
	 */
	EReference getFormulaire_Champs();

	/**
	 * Returns the meta object for the container reference '{@link cms_association.cmsassociation.Formulaire#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Association</em>'.
	 * @see cms_association.cmsassociation.Formulaire#getAssociation()
	 * @see #getFormulaire()
	 * @generated
	 */
	EReference getFormulaire_Association();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Champ <em>Champ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Champ</em>'.
	 * @see cms_association.cmsassociation.Champ
	 * @generated
	 */
	EClass getChamp();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Champ#getLibelle <em>Libelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libelle</em>'.
	 * @see cms_association.cmsassociation.Champ#getLibelle()
	 * @see #getChamp()
	 * @generated
	 */
	EAttribute getChamp_Libelle();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Champ#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cms_association.cmsassociation.Champ#getType()
	 * @see #getChamp()
	 * @generated
	 */
	EAttribute getChamp_Type();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Champ#isObligatoire <em>Obligatoire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obligatoire</em>'.
	 * @see cms_association.cmsassociation.Champ#isObligatoire()
	 * @see #getChamp()
	 * @generated
	 */
	EAttribute getChamp_Obligatoire();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Demande <em>Demande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demande</em>'.
	 * @see cms_association.cmsassociation.Demande
	 * @generated
	 */
	EClass getDemande();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Demande#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see cms_association.cmsassociation.Demande#getReference()
	 * @see #getDemande()
	 * @generated
	 */
	EAttribute getDemande_Reference();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Demande#getDatePlanifiee <em>Date Planifiee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Planifiee</em>'.
	 * @see cms_association.cmsassociation.Demande#getDatePlanifiee()
	 * @see #getDemande()
	 * @generated
	 */
	EAttribute getDemande_DatePlanifiee();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Demande#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cms_association.cmsassociation.Demande#getDescription()
	 * @see #getDemande()
	 * @generated
	 */
	EAttribute getDemande_Description();

	/**
	 * Returns the meta object for the reference '{@link cms_association.cmsassociation.Demande#getFormulaire <em>Formulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formulaire</em>'.
	 * @see cms_association.cmsassociation.Demande#getFormulaire()
	 * @see #getDemande()
	 * @generated
	 */
	EReference getDemande_Formulaire();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Demande#getReponses <em>Reponses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponses</em>'.
	 * @see cms_association.cmsassociation.Demande#getReponses()
	 * @see #getDemande()
	 * @generated
	 */
	EReference getDemande_Reponses();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Plateforme <em>Plateforme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plateforme</em>'.
	 * @see cms_association.cmsassociation.Plateforme
	 * @generated
	 */
	EClass getPlateforme();

	/**
	 * Returns the meta object for the containment reference list '{@link cms_association.cmsassociation.Plateforme#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see cms_association.cmsassociation.Plateforme#getAssociations()
	 * @see #getPlateforme()
	 * @generated
	 */
	EReference getPlateforme_Associations();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Plateforme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see cms_association.cmsassociation.Plateforme#getNom()
	 * @see #getPlateforme()
	 * @generated
	 */
	EAttribute getPlateforme_Nom();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse</em>'.
	 * @see cms_association.cmsassociation.Reponse
	 * @generated
	 */
	EClass getReponse();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Reponse#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see cms_association.cmsassociation.Reponse#getValeur()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Valeur();

	/**
	 * Returns the meta object for the reference '{@link cms_association.cmsassociation.Reponse#getChamp <em>Champ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Champ</em>'.
	 * @see cms_association.cmsassociation.Reponse#getChamp()
	 * @see #getReponse()
	 * @generated
	 */
	EReference getReponse_Champ();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.ContenuCMS <em>Contenu CMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu CMS</em>'.
	 * @see cms_association.cmsassociation.ContenuCMS
	 * @generated
	 */
	EClass getContenuCMS();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.ContenuCMS#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see cms_association.cmsassociation.ContenuCMS#getTitre()
	 * @see #getContenuCMS()
	 * @generated
	 */
	EAttribute getContenuCMS_Titre();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.ContenuCMS#isPublie <em>Publie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publie</em>'.
	 * @see cms_association.cmsassociation.ContenuCMS#isPublie()
	 * @see #getContenuCMS()
	 * @generated
	 */
	EAttribute getContenuCMS_Publie();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.ContenuCMS#getDateCreation <em>Date Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Creation</em>'.
	 * @see cms_association.cmsassociation.ContenuCMS#getDateCreation()
	 * @see #getContenuCMS()
	 * @generated
	 */
	EAttribute getContenuCMS_DateCreation();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.ContenuCMS#getDateModification <em>Date Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Modification</em>'.
	 * @see cms_association.cmsassociation.ContenuCMS#getDateModification()
	 * @see #getContenuCMS()
	 * @generated
	 */
	EAttribute getContenuCMS_DateModification();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.ContenuCMS#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see cms_association.cmsassociation.ContenuCMS#getSlug()
	 * @see #getContenuCMS()
	 * @generated
	 */
	EAttribute getContenuCMS_Slug();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see cms_association.cmsassociation.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Page#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see cms_association.cmsassociation.Page#getContenu()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Contenu();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see cms_association.cmsassociation.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Article#getResume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume</em>'.
	 * @see cms_association.cmsassociation.Article#getResume()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Resume();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Article#getDatePublication <em>Date Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Publication</em>'.
	 * @see cms_association.cmsassociation.Article#getDatePublication()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_DatePublication();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Article#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see cms_association.cmsassociation.Article#getContenu()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Contenu();

	/**
	 * Returns the meta object for the reference '{@link cms_association.cmsassociation.Article#getAuteur <em>Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auteur</em>'.
	 * @see cms_association.cmsassociation.Article#getAuteur()
	 * @see #getArticle()
	 * @generated
	 */
	EReference getArticle_Auteur();

	/**
	 * Returns the meta object for class '{@link cms_association.cmsassociation.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see cms_association.cmsassociation.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Media#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see cms_association.cmsassociation.Media#getNom()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Nom();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Media#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see cms_association.cmsassociation.Media#getUrl()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Url();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Media#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cms_association.cmsassociation.Media#getDescription()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Description();

	/**
	 * Returns the meta object for the attribute '{@link cms_association.cmsassociation.Media#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cms_association.cmsassociation.Media#getType()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Type();

	/**
	 * Returns the meta object for enum '{@link cms_association.cmsassociation.ChampType <em>Champ Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Champ Type</em>'.
	 * @see cms_association.cmsassociation.ChampType
	 * @generated
	 */
	EEnum getChampType();

	/**
	 * Returns the meta object for enum '{@link cms_association.cmsassociation.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see cms_association.cmsassociation.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CmsassociationFactory getCmsassociationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.EntiteImpl <em>Entite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.EntiteImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getEntite()
		 * @generated
		 */
		EClass ENTITE = eINSTANCE.getEntite();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITE__ID = eINSTANCE.getEntite_Id();

		/**
		 * The meta object literal for the '<em><b>Actif</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITE__ACTIF = eINSTANCE.getEntite_Actif();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.AssociationImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__EMAIL = eINSTANCE.getAssociation_Email();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NOM = eINSTANCE.getAssociation_Nom();

		/**
		 * The meta object literal for the '<em><b>Num Tel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NUM_TEL = eINSTANCE.getAssociation_NumTel();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ADRESSE = eINSTANCE.getAssociation_Adresse();

		/**
		 * The meta object literal for the '<em><b>Formulaires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__FORMULAIRES = eINSTANCE.getAssociation_Formulaires();

		/**
		 * The meta object literal for the '<em><b>Demandes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__DEMANDES = eINSTANCE.getAssociation_Demandes();

		/**
		 * The meta object literal for the '<em><b>Utilisateurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__UTILISATEURS = eINSTANCE.getAssociation_Utilisateurs();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ROLES = eINSTANCE.getAssociation_Roles();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__PAGES = eINSTANCE.getAssociation_Pages();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ARTICLES = eINSTANCE.getAssociation_Articles();

		/**
		 * The meta object literal for the '<em><b>Medias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__MEDIAS = eINSTANCE.getAssociation_Medias();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.UtilisateurImpl <em>Utilisateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.UtilisateurImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getUtilisateur()
		 * @generated
		 */
		EClass UTILISATEUR = eINSTANCE.getUtilisateur();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__EMAIL = eINSTANCE.getUtilisateur_Email();

		/**
		 * The meta object literal for the '<em><b>Nom Complet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__NOM_COMPLET = eINSTANCE.getUtilisateur_NomComplet();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATEUR__ROLE = eINSTANCE.getUtilisateur_Role();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.RoleImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NOM = eINSTANCE.getRole_Nom();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.FormulaireImpl <em>Formulaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.FormulaireImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getFormulaire()
		 * @generated
		 */
		EClass FORMULAIRE = eINSTANCE.getFormulaire();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__NOM = eINSTANCE.getFormulaire_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__DESCRIPTION = eINSTANCE.getFormulaire_Description();

		/**
		 * The meta object literal for the '<em><b>Champs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULAIRE__CHAMPS = eINSTANCE.getFormulaire_Champs();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULAIRE__ASSOCIATION = eINSTANCE.getFormulaire_Association();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.ChampImpl <em>Champ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.ChampImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getChamp()
		 * @generated
		 */
		EClass CHAMP = eINSTANCE.getChamp();

		/**
		 * The meta object literal for the '<em><b>Libelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMP__LIBELLE = eINSTANCE.getChamp_Libelle();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMP__TYPE = eINSTANCE.getChamp_Type();

		/**
		 * The meta object literal for the '<em><b>Obligatoire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMP__OBLIGATOIRE = eINSTANCE.getChamp_Obligatoire();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.DemandeImpl <em>Demande</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.DemandeImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getDemande()
		 * @generated
		 */
		EClass DEMANDE = eINSTANCE.getDemande();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMANDE__REFERENCE = eINSTANCE.getDemande_Reference();

		/**
		 * The meta object literal for the '<em><b>Date Planifiee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMANDE__DATE_PLANIFIEE = eINSTANCE.getDemande_DatePlanifiee();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMANDE__DESCRIPTION = eINSTANCE.getDemande_Description();

		/**
		 * The meta object literal for the '<em><b>Formulaire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMANDE__FORMULAIRE = eINSTANCE.getDemande_Formulaire();

		/**
		 * The meta object literal for the '<em><b>Reponses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEMANDE__REPONSES = eINSTANCE.getDemande_Reponses();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.PlateformeImpl <em>Plateforme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.PlateformeImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getPlateforme()
		 * @generated
		 */
		EClass PLATEFORME = eINSTANCE.getPlateforme();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATEFORME__ASSOCIATIONS = eINSTANCE.getPlateforme_Associations();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATEFORME__NOM = eINSTANCE.getPlateforme_Nom();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.ReponseImpl <em>Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.ReponseImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getReponse()
		 * @generated
		 */
		EClass REPONSE = eINSTANCE.getReponse();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__VALEUR = eINSTANCE.getReponse_Valeur();

		/**
		 * The meta object literal for the '<em><b>Champ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPONSE__CHAMP = eINSTANCE.getReponse_Champ();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.ContenuCMSImpl <em>Contenu CMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.ContenuCMSImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getContenuCMS()
		 * @generated
		 */
		EClass CONTENU_CMS = eINSTANCE.getContenuCMS();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_CMS__TITRE = eINSTANCE.getContenuCMS_Titre();

		/**
		 * The meta object literal for the '<em><b>Publie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_CMS__PUBLIE = eINSTANCE.getContenuCMS_Publie();

		/**
		 * The meta object literal for the '<em><b>Date Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_CMS__DATE_CREATION = eINSTANCE.getContenuCMS_DateCreation();

		/**
		 * The meta object literal for the '<em><b>Date Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_CMS__DATE_MODIFICATION = eINSTANCE.getContenuCMS_DateModification();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU_CMS__SLUG = eINSTANCE.getContenuCMS_Slug();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.PageImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__CONTENU = eINSTANCE.getPage_Contenu();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.ArticleImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__RESUME = eINSTANCE.getArticle_Resume();

		/**
		 * The meta object literal for the '<em><b>Date Publication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__DATE_PUBLICATION = eINSTANCE.getArticle_DatePublication();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__CONTENU = eINSTANCE.getArticle_Contenu();

		/**
		 * The meta object literal for the '<em><b>Auteur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLE__AUTEUR = eINSTANCE.getArticle_Auteur();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.impl.MediaImpl
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__NOM = eINSTANCE.getMedia_Nom();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__URL = eINSTANCE.getMedia_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__DESCRIPTION = eINSTANCE.getMedia_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__TYPE = eINSTANCE.getMedia_Type();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.ChampType <em>Champ Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.ChampType
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getChampType()
		 * @generated
		 */
		EEnum CHAMP_TYPE = eINSTANCE.getChampType();

		/**
		 * The meta object literal for the '{@link cms_association.cmsassociation.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cms_association.cmsassociation.MediaType
		 * @see cms_association.cmsassociation.impl.CmsassociationPackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

	}

} //CmsassociationPackage
