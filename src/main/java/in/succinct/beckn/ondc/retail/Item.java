package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BecknObject;

import java.util.Date;

public class Item extends in.succinct.beckn.Item {
    public Item() { super();}

    // TODO Add Rating

    public String getParentItemId(){
        return get("parent_item_id");
    }
    public void setParentItemId(String parent_item_id){
        set("parent_item_id",parent_item_id);
    }

    public ItemQuantity getItemQuantity(){
        return get(ItemQuantity.class,"quantity");
    }
    public void setItemQuantity(ItemQuantity quantity){
        set("quantity",quantity.getInner());
    }

    public Integer getRating(){
        return get("rating");
    }
    public void setRating(Integer rating){
        set("rating",rating);
    }
    
    public Time getTime(){
        return get(Time.class,"time");
    }
    public void setTime(Time time){
        set("time",time.getInner());
    }

    public boolean getRateable(){
        return getBoolean("rateable");
    }
    public void setRateable(boolean rateable){
        set("rateable",rateable);
    }

    public boolean getMatched(){
        return getBoolean("matched");
    }
    public void setMatched(boolean matched){
        set("matched",matched);
    }

    public boolean getRelated(){
        return getBoolean("related");
    }
    public void setRelated(boolean related){
        set("related",related);
    }

    public boolean getRecommended(){
        return getBoolean("recommended");
    }
    public void setRecommended(boolean recommended){
        set("recommended",recommended);
    }

    public boolean getReturnable(){
        return getBoolean("@ondc/org/returnable");
    }
    public void setReturnable(boolean returnable){
        set("@ondc/org/returnable",returnable);
    }

    public boolean getSellerPickupReturn(){
        return getBoolean("@ondc/org/seller_pickup_return");
    }
    public void setSellerPickupReturn(boolean seller_pickup_return){
        set("@ondc/org/seller_pickup_return",seller_pickup_return);
    }

    public boolean getCancellable(){
        return getBoolean("@ondc/org/cancellable");
    }
    public void setCancellable(boolean cancellable){
        set("@ondc/org/cancellable",cancellable);
    }

    public Date getReturnWindow(){
        return getDate("@ondc/org/return_window");
    }
    public void setReturnWindow(Date return_window){
        set("@ondc/org/return_window",return_window, TIMESTAMP_FORMAT);
    }

    public Date getTimeToShip(){
        return getDate("@ondc/org/time_to_ship");
    }
    public void setTimeToShip(Date time_to_ship){
        set("@ondc/org/time_to_ship",time_to_ship, TIMESTAMP_FORMAT);
    }

    public boolean getAvailableOnCod(){
        return getBoolean("@ondc/org/available_on_cod");
    }
    public void setAvailableOnCod(boolean available_on_cod){
        set("@ondc/org/available_on_cod",available_on_cod);
    }

    public String getContactDetailsConsumerCare(){
        return get("@ondc/org/contact_details_consumer_care");
    }
    public void setContactDetailsConsumerCare(String contact_details_consumer_care){
        set("@ondc/org/contact_details_consumer_care",contact_details_consumer_care);
    }

    public StatutoryReqsPackagedCommodities getStatutoryReqsPackagedCommodities(){
        return get(StatutoryReqsPackagedCommodities.class,"@ondc/org/statutory_reqs_packaged_commodities");
    }
    public void setStatutoryReqsPackagedCommodities(StatutoryReqsPackagedCommodities statutory_reqs_packaged_commodities){
        set("@ondc/org/statutory_reqs_packaged_commodities",statutory_reqs_packaged_commodities);
    }

    public static class StatutoryReqsPackagedCommodities extends BecknObject {
        public String getManufacturerOfPackerName(){
            return get("manufacturer_or_packer_name");
        }
        public void setManufacturerOfPackerName(String manufacturer_or_packer_name){
            set("manufacturer_or_packer_name",manufacturer_or_packer_name);
        }

        public String getManufacturerOfPackerAddress(){
            return get("manufacturer_or_packer_address");
        }
        public void setManufacturerOfPackerAddress(String manufacturer_or_packer_address){
            set("manufacturer_or_packer_address",manufacturer_or_packer_address);
        }

        public String getCommonOrGenericNameOfCommodity(){
            return get("common_or_generic_name_of_commodity");
        }
        public void setCommonOrGenericNameOfCommodity(String common_or_generic_name_of_commodity){
            set("common_or_generic_name_of_commodity",common_or_generic_name_of_commodity);
        }

        public String getMultipleProductsNameNumberOrQty(){
            return get("multiple_products_name_number_or_qty");
        }
        public void setMultipleProductsNameNumberOrQty(String multiple_products_name_number_or_qty){
            set("multiple_products_name_number_or_qty",multiple_products_name_number_or_qty);
        }

        public String getNetQuantityOrMeasureOfCommodityInPkg(){
            return get("net_quantity_or_measure_of_commodity_in_pkg");
        }
        public void setNetQuantityOrMeasureOfCommodityInPkg(String net_quantity_or_measure_of_commodity_in_pkg){
            set("net_quantity_or_measure_of_commodity_in_pkg",net_quantity_or_measure_of_commodity_in_pkg);
        }

        public String getMonthYearOfManufacturePackingImport(){
            return get("month_year_of_manufacture_packing_import");
        }
        public void setMonthYearOfManufacturePackingImport(String month_year_of_manufacture_packing_import){
            set("month_year_of_manufacture_packing_import",month_year_of_manufacture_packing_import);
        }

        public String getImportedProductCountryOfOrigin(){
            return get("imported_product_country_of_origin");
        }
        public void setImportedProductCountryOfOrigin(String imported_product_country_of_origin){
            set("imported_product_country_of_origin",imported_product_country_of_origin);
        }
    }

    public static class StatutoryReqsPrepackagedFood extends BecknObject {
        public String getIngredientsInfo(){
            return get("ingredients_info");
        }
        public void setIngredientsInfo(String ingredients_info){
            set("ingredients_info",ingredients_info);
        }

        public String getNutritionalInfo(){
            return get("nutritional_info");
        }
        public void setNutritionalInfo(String nutritional_info){
            set("nutritional_info",nutritional_info);
        }

        public String getAdditivesInfo(){
            return get("additives_info");
        }
        public void setAdditivesInfo(String additives_info){
            set("additives_info",additives_info);
        }

        public String getManufacturerOfPackerName(){
            return get("manufacturer_or_packer_name");
        }
        public void setManufacturerOfPackerName(String manufacturer_or_packer_name){
            set("manufacturer_or_packer_name",manufacturer_or_packer_name);
        }

        public String getManufacturerOfPackerAddress(){
            return get("manufacturer_or_packer_address");
        }
        public void setManufacturerOfPackerAddress(String manufacturer_or_packer_address){
            set("manufacturer_or_packer_address",manufacturer_or_packer_address);
        }

        public String getBrandOwnerName(){
            return get("brand_owner_name");
        }
        public void setBrandOwnerName(String brand_owner_name){
            set("brand_owner_name",brand_owner_name);
        }

        public String getBrandOwnerAddress(){
            return get("brand_owner_address");
        }
        public void setBrandOwnerAddress(String brand_owner_address){
            set("brand_owner_address",brand_owner_address);
        }

        public String getBrandOwnerFSSAILogo(){
            return get("brand_owner_FSSAI_logo");
        }
        public void setBrandOwnerFSSAILogo(String brand_owner_FSSAI_logo){
            set("brand_owner_FSSAI_logo",brand_owner_FSSAI_logo);
        }

        public String getBrandOwnerFSSAILicenseNo(){
            return get("brand_owner_FSSAI_license_no");
        }
        public void setBrandOwnerFSSAILicenseNo(String brand_owner_FSSAI_license_no){
            set("brand_owner_FSSAI_license_no",brand_owner_FSSAI_license_no);
        }

        public String getOtherFSSAILicenseNo(){
            return get("other_FSSAI_license_no");
        }
        public void setOtherFSSAILicenseNo(String other_FSSAI_license_no){
            set("other_FSSAI_license_no",other_FSSAI_license_no);
        }

        public String getNetQuantity(){
            return get("net_quantity");
        }
        public void setNetQuantity(String net_quantity){
            set("net_quantity",net_quantity);
        }

        public String getImporterName(){
            return get("importer_name");
        }
        public void setImporterName(String importer_name){
            set("importer_name",importer_name);
        }

        public String getImporterAddress(){
            return get("importer_name");
        }
        public void setImporterAddress(String importer_name){
            set("importer_name",importer_name);
        }

        public String getImporterFSSAILogo(){
            return get("importer_FSSAI_logo");
        }
        public void setImporterFSSAILogo(String importer_FSSAI_logo){
            set("importer_FSSAI_logo",importer_FSSAI_logo);
        }

        public String getImporterFSSAILicenseNo(){
            return get("importer_FSSAI_license_no");
        }
        public void setImporterFSSAILicenseNo(String importer_FSSAI_license_no){
            set("importer_FSSAI_license_no",importer_FSSAI_license_no);
        }

        public String getImportedProductCountryOfOrigin(){
            return get("imported_product_country_of_origin");
        }
        public void setImportedProductCountryOfOrigin(String imported_product_country_of_origin){
            set("imported_product_country_of_origin",imported_product_country_of_origin);
        }

        public String getOtherImporterName(){
            return get("other_importer_name");
        }
        public void setOtherImporterName(String other_importer_name){
            set("other_importer_name",other_importer_name);
        }

        public String getOtherImporterAddress(){
            return get("other_importer_address");
        }
        public void setOtherImporterAddress(String other_importer_address){
            set("other_importer_address",other_importer_address);
        }

        public String getOtherPremises(){
            return get("other_premises");
        }
        public void setOtherPremises(String other_premises){
            set("other_premises",other_premises);
        }

        public String getOtherImporterCountryOfOrigin(){
            return get("other_importer_country_of_origin");
        }
        public void setOtherImporterCountryOfOrigin(String other_importer_country_of_origin){
            set("other_importer_country_of_origin",other_importer_country_of_origin);
        }
    }

    public static class MandatoryReqsVeggiesFruits extends BecknObject {

    }
}
