import { TestBed } from '@angular/core/testing';

import { LibMngSysService } from './lib-mng-sys.service';

describe('LibMngSysService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LibMngSysService = TestBed.get(LibMngSysService);
    expect(service).toBeTruthy();
  });
});
