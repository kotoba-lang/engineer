# kotoba-lang/engineer

Zero-dep portable `.cljc` — restored from the legacy `kami-engine/kami-eng-*`
Rust crates (deleted in kotoba-lang/kami-engine PR #82 "Remove Rust workspace
from kami-engine") as part of the **clj-wgsl migration** (ADR-2607010930,
`com-junkawasaki/root`).

Shared CAD/EDA engineering foundation: constraint solver, parametric engine, undo/redo, measurement, selection, layer, grid, DRC (Design Rule Check) base. Consumed by domain repos (dft/spice/pdk/pnr/bim/rtl/cad/cae-solver/eda).

## Status

Scaffold only — the CLJC restoration is pending. This repo provides the home
for the zero-dep portable `.cljc` contracts / data interpreters / EDN IR
that replace the deleted Rust crate. Native execution (wgpu / wasmtime /
wasmi), where needed, stays substrate.

## Develop

```bash
clojure -M:test
```
