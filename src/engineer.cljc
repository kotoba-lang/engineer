(ns engineer
  "Zero-dep portable CLJC. Restored from the legacy kami-engine/kami-eng-* Rust
  crates (deleted in kotoba-lang/kami-engine #82 'Remove Rust workspace from
  kami-engine') as part of the clj-wgsl migration (ADR-2607010930,
  com-junkawasaki/root). Native execution stays substrate; this namespace
  owns the CLJC contracts / data interpreters / EDN IR for the domain.

  Shared CAD/EDA engineering foundation: constraint solver, parametric engine, undo/redo, measurement, selection, layer, grid, DRC (Design Rule Check) base. Consumed by domain repos (dft/spice/pdk/pnr/bim/rtl/cad/cae-solver/eda).")
