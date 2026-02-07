# java-ac4y-base4jsonandxml - Architektúra Dokumentáció

## Áttekintés

Alap osztályok JSON és XML szerializálási képességekkel.

**Verzió:** 1.0.0
**Java verzió:** 1.8
**Szervezet:** ac4y-auto

## Fő Komponensek

### 1. Ac4y
`Ac4yObject`-et terjeszti ki. `@MappedSuperclass` + `@XmlRootElement`.

**Metódusok:**
- `getAsJson()` → JSON string (GsonCap, pretty print)
- `getFromJson(String json)` → Object (Gson.fromJson)
- `getAsXml()` → XML string (JAXB marshal)
- `getFromXml(String xml)` → Object (JAXB unmarshal)

### 2. Ac4yNoId
Könnyű szerializálási alap azonosítás nélkül. Ugyanazok a JSON/XML metódusok mint az Ac4y-ban.

### 3. Utility (duplikált)
`GsonCap` és `JaxbCap` - az ac4y-class modulból is elérhetőek, itt is megvannak a kompatibilitás miatt.

## Függőségek
- `ac4y-class` - Ac4yObject, Ac4yIdentification alap osztályok

## AI Agent Használati Útmutató

### Gyors Döntési Fa
1. **Objektum azonosítással + szerializálás** → `Ac4y` (extends Ac4yObject)
2. **Szerializálás azonosítás nélkül** → `Ac4yNoId`

## Eredetileg
`IJAc4yObjectModule/IJAc4yBase4JsonAndXml` modulból kiemelve.

---
**Utolsó frissítés:** 2026-02-06
